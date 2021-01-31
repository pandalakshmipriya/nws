/**
 * 
 */
package com.brcom.apps.gov.nws.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

/**
 * @author Lakshmipriya
 *
 */
@Data
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
public class WeatherServiceException {
	
	@JsonProperty("correlationId")
	private String correlationId;
	
	@JsonProperty("title")
	private String title;
	
	@JsonProperty("type")
	private String type;
	
	@JsonProperty("status")
	private int status;
	
	@JsonProperty("detail")
	private String detail;
	
	@JsonProperty("instance")
	private String instance;
}
