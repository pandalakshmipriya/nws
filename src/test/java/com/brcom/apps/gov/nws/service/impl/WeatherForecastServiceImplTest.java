/**
 * 
 */
package com.brcom.apps.gov.nws.service.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.brcom.apps.gov.nws.model.GridRoot;
import com.brcom.apps.gov.nws.model.PointRoot;
import com.brcom.apps.gov.nws.model.WeatherServiceException;

/**
 * @author Lakshmipriya
 *
 */
public class WeatherForecastServiceImplTest {
	
	private WeatherForecastServiceImpl service = new WeatherForecastServiceImpl();
	

	/**
	 * Test method for {@link com.brcom.apps.gov.noaa.service.impl.WeatherForecastServiceImpl#WeatherForecastServiceImpl()}.
	 */
	@Test
	public void testWeatherForecastServiceImpl() throws Exception {
		assertNotNull(service);
	}

	/**
	 * Test method for {@link com.brcom.apps.gov.noaa.service.impl.WeatherForecastServiceImpl#getPoint(double, double)}.
	 */
	@Test
	public void testGetPoint_Exception() throws Exception {
		Object obj = service.getPoint(0, 0);
		assertTrue(obj instanceof WeatherServiceException);
	}

	/**
	 * Test method for {@link com.brcom.apps.gov.noaa.service.impl.WeatherForecastServiceImpl#getGrid(java.lang.String, int, int)}.
	 */
	@Test
	public void testGetGrid_Exception() throws Exception {
		Object obj = service.getGrid("DUMMY", 0, 0);
		assertTrue(obj instanceof WeatherServiceException);
	}
	/**
	 * Test method for {@link com.brcom.apps.gov.noaa.service.impl.WeatherForecastServiceImpl#getPoint(double, double)}.
	 */
	@Test
	public void testGetPoint_Success() throws Exception {
		Object obj = service.getPoint(39.7456,-97.0892);
		assertTrue(obj instanceof PointRoot);
	}

	/**
	 * Test method for {@link com.brcom.apps.gov.noaa.service.impl.WeatherForecastServiceImpl#getGrid(java.lang.String, int, int)}.
	 */
	@Test
	public void testGetGrid_Success() throws Exception {
		Object obj = service.getGrid("TWC", 93, 47);
		assertTrue(obj instanceof GridRoot);
	}

	/**
	 * Test method for {@link com.brcom.apps.gov.noaa.service.impl.WeatherForecastServiceImpl#getForeCast(double, double)}.
	 */
	@Test
	public void testGetForeCast() throws Exception {
		String result = service.getForeCast(0, 0);
		assertEquals("Unable to provide data for requested point 0,0", result);
		result = service.getForeCast(39.7456,-97.0892);
		assertTrue(result.contains("WeatherForeCast details for the next Five Days"));
	}

}
