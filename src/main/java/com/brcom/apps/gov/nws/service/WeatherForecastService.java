/**
 * 
 */
package com.brcom.apps.gov.nws.service;

/**
 * @author Lakshmipriya
 *
 */
public interface WeatherForecastService {
	Object getPoint(double latitude, double longitude) throws Exception;
	Object getGrid(String office, int gridX,int gridY) throws Exception;
	String getForeCast(double latitude, double longitude);
}
