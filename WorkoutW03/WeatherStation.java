public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
	
		CurrentConditionsDisplay currentDisplay = 
			new CurrentConditionsDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);
        WindchillDisplay windchillDisplay = new WindchillDisplay(weatherData);

		weatherData.setMeasurements(80, 65, 30.4f, 20);
		weatherData.setMeasurements(82, 70, 29.2f, 5);
		weatherData.setMeasurements(78, 90, 29.2f, 8);
		
		weatherData.removeObserver(forecastDisplay);
		weatherData.setMeasurements(62, 90, 28.1f, 11);
	}
}
