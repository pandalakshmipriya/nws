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
public class Bearing{
	@JsonProperty("value")
	private int value;
	@JsonProperty("unitCode")
	private String unitCode;
}

