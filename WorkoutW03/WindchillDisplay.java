public class WindchillDisplay implements Observer, DisplayElement{
    
    double windchill;
    double tempInF = 89.2231;
    double tempInC;
    double windSpeedMPH = 15.3345;
    double windSpeedMS; 
    private WeatherData weatherData;

    public WindchillDisplay(WeatherData  weatherData){
        this.weatherData = weatherData;
        weatherData.registerObserver(this); 
    }

    public void update(float temp, float humidity, float pessure, float wind){
        tempInC = (5/9)*(tempInF - 32);
        windSpeedMS = .44704 * windSpeedMPH;
        windchill = ((12.1452 + 11.6222 * ((int) Math.sqrt(windSpeedMS)) - 1.16222 * windSpeedMS) * (33 - tempInC));   
        display();    
    }

    public void display(){
       System.out.printf("The wind speed is: %f watts/meter^^2 %n", windSpeedMS);
    }

}
