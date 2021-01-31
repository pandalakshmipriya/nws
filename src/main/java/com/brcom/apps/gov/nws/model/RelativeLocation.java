/**
 * 
 */
package com.brcom.apps.gov.nws.model;

import org.geojson.Point;

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
public class RelativeLocation{
    @JsonProperty("type")
	private String type;
    @JsonProperty("geometry")
    private Point geometry;
    @JsonProperty("properties")
    private RelativeLocProperties properties;

}
