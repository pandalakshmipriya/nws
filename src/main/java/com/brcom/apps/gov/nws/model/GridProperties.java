package com.brcom.apps.gov.nws.model;

import java.util.Date;
import java.util.List;

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
@JsonIgnoreProperties(ignoreUnknown = true)
@ToString
public class GridProperties {

	@JsonProperty("updated")
	private Date updated;
	
	@JsonProperty("units")
	private String units;
	
	@JsonProperty("forecastGenerator")
	private String forecastGenerator;
	
	@JsonProperty("generatedAt")
	private Date generatedAt;
	
	@JsonProperty("updateTime")
	private Date updateTime;
	
	@JsonProperty("validTimes")
	private String validTimes;
	
	@JsonProperty("elevation")
	private Elevation elevation;
	
	@JsonProperty("periods")
	private List<Period> periods;
}
