/**
 * 
 */
package com.brcom.apps.gov.nws.service.impl;

import java.io.IOException;
import java.util.List;

import org.apache.http.HttpEntity;
import org.apache.http.HttpStatus;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import com.brcom.apps.gov.nws.model.GridRoot;
import com.brcom.apps.gov.nws.model.Period;
import com.brcom.apps.gov.nws.model.PointRoot;
import com.brcom.apps.gov.nws.model.WeatherServiceException;
import com.brcom.apps.gov.nws.service.WeatherForecastService;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Lakshmipriya
 *
 */
public class WeatherForecastServiceImpl implements WeatherForecastService {

	private final CloseableHttpClient client;
	private CloseableHttpResponse response;
	private HttpEntity entity;
	private final String BASE_URL = "https://api.weather.gov";
	private ObjectMapper mapper;
	private final String NEW_LINE = "\n";
	private final String EXP_SERVIE= "Exception in getting data for the requested point!";
	public WeatherForecastServiceImpl() {
		client =HttpClients.createDefault();
		mapper = new ObjectMapper();
	}

	/**
	 * Get the point details 
	 */
	@Override
	public Object getPoint(double latitude, double longitude) throws IOException, InterruptedException {
		HttpGet  request = new HttpGet(BASE_URL+"/points/"+latitude+","+longitude);
		PointRoot pr = null;
		response = client.execute(request);
		int statusCode = response.getStatusLine().getStatusCode();
		entity = response.getEntity();
		if (entity != null) {
			String result = EntityUtils.toString(entity);
			if(statusCode!=HttpStatus.SC_OK) {
				return mapper.readValue(result, WeatherServiceException.class);
			}
			pr = mapper.readValue(result, PointRoot.class);
		}
		return pr;
	}
	/**
	 * Get the Grid details 
	 */
	@Override
	public Object getGrid(String office, int gridX, int gridY) throws IOException, InterruptedException {
		GridRoot gr =null;
		HttpGet request = new HttpGet(BASE_URL+"/gridpoints/"+office+"/"+gridX+","+gridY+"/forecast");
		response = client.execute(request);
		entity = response.getEntity();
		int statusCode = response.getStatusLine().getStatusCode();
		if (entity != null) {
			String result = EntityUtils.toString(entity);
			if(statusCode!=HttpStatus.SC_OK) {
				return mapper.readValue(result, WeatherServiceException.class);
			}
			gr = mapper.readValue(result, GridRoot.class);
		}
		return gr;
	}
	/**
	 * Get forecast details
	 */
	@Override
	public String getForeCast(double latitude, double longitude){
		try {
			Object resultObj = getPoint(latitude, longitude);
			if(resultObj instanceof WeatherServiceException) {
				return getExceptionDetail(resultObj);
			}else if(resultObj instanceof PointRoot) {
				PointRoot pr = (PointRoot)resultObj;
				String office = pr.getProperties().getGridId();
				int gridX = pr.getProperties().getGridX();
				int girdY = pr.getProperties().getGridY();
				resultObj = getGrid(office, gridX, girdY);
				if(resultObj instanceof WeatherServiceException) {
					return getExceptionDetail(resultObj);
				}else {
					GridRoot gr = (GridRoot) resultObj;
					List<Period> periods = gr.getProperties().getPeriods();
					return getForeCastDetailsOfDays(periods, 5);
				}
			}
		}catch(Exception ex) {
			return EXP_SERVIE;
		}

		return null;
	}

	/**
	 * 
	 * @param expObj
	 * @return Exception Object 
	 */
	private String getExceptionDetail(Object expObj) {
		WeatherServiceException wExpObj  = (WeatherServiceException) expObj;
		return wExpObj.getDetail();
	}
	/**
	 * 
	 * @param periods
	 * @param days
	 * @return Result of 5 dyas weather forecast details
	 */
	private String getForeCastDetailsOfDays(List<Period> periods,int days) {
		StringBuffer sb = new StringBuffer();
		sb.append("WeatherForeCast details for the next Five Days")
		.append(NEW_LINE)
		.append("=================================================")
		.append(NEW_LINE);

		for(int i =0;i<days*2;i++) {
			sb.append(periods.get(i).toString())
			.append(NEW_LINE);
		}
		return sb.toString();
	}
}
