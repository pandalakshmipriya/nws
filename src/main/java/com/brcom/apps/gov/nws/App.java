package com.brcom.apps.gov.nws;

import java.io.IOException;

import com.brcom.apps.gov.nws.service.WeatherForecastService;
import com.brcom.apps.gov.nws.service.impl.WeatherForecastServiceImpl;

/**
 * Weather Forecast App
 *
 */
public class App 
{
	private double latitude;
	private double longitude;
	/**
	 * 
	 * @param args
	 * @throws IOException
	 * @throws InterruptedException
	 */
	public static void main( String[] args )
	{
		try {
			if(args.length>0 && args.length==2) {
				App app = new App();
				app.latitude= Double.parseDouble(args[0]);
				app.longitude=Double.parseDouble(args[1]);
				app.printForeCast();
			}else {
				System.out.println("Plese provide latitude and longitude pair!");
			}
		}catch(Exception ex) {
			System.out.println("Error Occurred in getting weather forecast!");
		}
	}
	/**
	 * 
	 */
	private void printForeCast() {
		WeatherForecastService service = new WeatherForecastServiceImpl();
		System.out.println(service.getForeCast(latitude,longitude));
	}
}
