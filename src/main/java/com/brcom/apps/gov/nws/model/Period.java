package com.brcom.apps.gov.nws.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Lakshmipriya
 *
 */
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Period {

	@JsonProperty("number")
	private int number;
	
	@JsonProperty("name")
	private String name;
	
	@JsonProperty("startTime")
	private Date startTime;
	
	@JsonProperty("endTime")
	private Date endTime;
	
	@JsonProperty("isDaytime")
	private boolean isDaytime;
	
	@JsonProperty("temperature")
	private int temperature;
	
	@JsonProperty("temperatureUnit")
    private String temperatureUnit;
	
	@JsonProperty("temperatureTrend")
    private Object temperatureTrend;
	
	@JsonProperty("windSpeed")
    private String windSpeed;
	
	@JsonProperty("windDirection")
    private String windDirection;
	
	@JsonProperty("icon")
    private String icon;
	
	@JsonProperty("shortForecast")
    private String shortForecast;
	
	@JsonProperty("detailedForecast")
    private String detailedForecast;
	
	@Override
	public String toString() {
		return this.getName()+":"+ this.getDetailedForecast();
	}
}
