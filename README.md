# NWS ( National Weather Service ) - Java Stand Alone Jar 
A Simple Java Stand alone jar to fetch weather forecast details of next five days from The National Oceanic and Atmospheric Administration (NOAA) which provides a free web service REST API to get the weather forecast for any point in North America. 

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
- Pass command line arguments pair of co-ordinates like below
  - java -jar target\nws-api-jar-with-dependencies.jar 39.7456 -97.0892
- Succesful result will be like below 
![alt text](https://github.com/pandalakshmipriya/nws/blob/master/assets/nws_test.PNG) 

## References

The Web Service guide:  https://www.weather.gov/documentation/services-web-api.
