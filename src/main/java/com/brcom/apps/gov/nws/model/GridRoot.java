/**
 * 
 */
package com.brcom.apps.gov.nws.model;

import org.geojson.GeoJsonObject;
import org.geojson.Geometry;

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
public class GridRoot {
	
	@JsonProperty("type")
	private String type;
	
	@JsonProperty("geometry")
	private Geometry<GeoJsonObject> geometry;
	
	@JsonProperty("properties")
	private GridProperties properties;
	
}
