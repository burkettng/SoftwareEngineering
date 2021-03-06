package headfirst.designpatterns.observer.weatherobservable;

import java.util.Observable;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		
		CurrentConditionsDisplay currentConditions = new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        WindchillDisplay windchillDisplay = new WindchillDisplay(weatherData); 

		weatherData.setMeasurements(80, 65, 30.4f, 16.4456);
		weatherData.setMeasurements(82, 70, 29.2f, 33.67);
        weatherData.setMeasurements(82, 70, 29.2f, 33.67);
		weatherData.setMeasurements(78, 90, 29.2f, 2.3345);
	}
}
