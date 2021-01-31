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
![alt text](https://github.com/pandalakshmipriya/nws/blob/master/assets/nws_test.PNG) 

## References

The Web Service guide:  https://www.weather.gov/documentation/services-web-api.
