/**
 * 
 */
package com.brcom.apps.gov.nws.model;

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
public class Distance{
	@JsonProperty("value")
	private double value;
	@JsonProperty("unitCode")
	private String unitCode;
}
