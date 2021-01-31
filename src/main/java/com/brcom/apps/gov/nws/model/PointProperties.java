/**
 * 
 */
package com.brcom.apps.gov.nws.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * @author Lakshmipriya
 *
 */
@Data
@NoArgsConstructor
@ToString
@JsonIgnoreProperties(ignoreUnknown = true)
public class PointProperties{
	@JsonProperty("@id")
	private String id;
	
	@JsonProperty("@type")
	private String type;
	
	@JsonProperty("cwa")
	private String cwa;
	
	@JsonProperty("forecastOffice")
	private String forecastOffice;
	
	@JsonProperty("gridId")
	private String gridId;
	
	@JsonProperty("gridX")
	private int gridX;
	
	@JsonProperty("gridY")
	private int gridY;
	
	@JsonProperty("forecast")
	private String forecast;
	
	@JsonProperty("forecastHourly")
	private String forecastHourly;
	
	@JsonProperty("forecastGridData")
	private String forecastGridData;
	
	@JsonProperty("observationStations")
	private String observationStations;
	
	@JsonProperty("relativeLocation")
	private RelativeLocation relativeLocation;
	
	@JsonProperty("forecastZone")
	private String forecastZone;
	
	@JsonProperty("county")
	private String county;
	
	@JsonProperty("fireWeatherZone")
	private String fireWeatherZone;
	
	@JsonProperty("timeZone")
	private String timeZone;
	
	@JsonProperty("radarStation")
	private String radarStation;
}