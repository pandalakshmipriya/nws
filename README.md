# NWS ( National Weather Service ) - Java Stand Alone Jar 
A Simple Java Stand Alone jar to fetch details from The National Oceanic and Atmospheric Administration (NOAA) which provides a free web service REST API to get the weather forecast for any point in North America. 

## Technolgy, libraries used
- Java 1.8
- Maven
- geojson-jackson
- lombok
- junit

## How to Run?

- Clone the repository into your local machine.
- From the repository folder run the command `mvn clean install`
- Executable jar will generate in the path : `target\nws-api-jar-with-dependencies.jar`
- Pass command line arguments like pair of co-ordinates 
  - java -jar target\nws-api-jar-with-dependencies.jar 39.7456 -97.0892
- Succesful result will be like below 
  - `WeatherForeCast details for the next Five Days
=================================================
This Afternoon:Mostly cloudy, with a high near 34. Northwest wind 10 to 15 mph, with gusts as high as 25 mph.
Tonight:Mostly cloudy, with a low around 18. North wind 5 to 10 mph.
Monday:Patchy freezing fog before noon. Partly sunny, with a high near 37. North wind 0 to 5 mph.
Monday Night:Mostly cloudy, with a low around 25. Southeast wind 0 to 10 mph.
Tuesday:Mostly sunny, with a high near 46. Southeast wind 5 to 10 mph.
Tuesday Night:Mostly clear, with a low around 30. South wind 5 to 10 mph.
Wednesday:Partly sunny, with a high near 50. South wind 10 to 15 mph.
Wednesday Night:A slight chance of rain after midnight. Mostly cloudy, with a low around 33. Southwest wind 5 to 10 mph. Chance of precipitation is 20%.
Thursday:A slight chance of rain before 7am, then a slight chance of rain and snow. Partly sunny, with a high near 40. Northwest wind 10 to 15 mph, with gusts as high as 30 mph. Chance of precipitation is 20%.
Thursday Night:A slight chance of snow before midnight. Partly cloudy, with a low around 20. Chance of precipitation is 20%.`

## References

The Web Service guide:  https://www.weather.gov/documentation/services-web-api.
