/**
 * 
 */
package com.brcom.apps.gov.nws.model;

import org.geojson.Point;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;
import lombok.Getter;
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
@Getter
public class PointRoot{
	@JsonProperty("id")
	private String id;
	@JsonProperty("type")
	private String type;
	@JsonProperty("geometry")
	private Point geometry;
	@JsonProperty("properties")
	private PointProperties properties;
}
