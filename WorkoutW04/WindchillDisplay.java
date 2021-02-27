package headfirst.designpatterns.observer.weatherobservable;

import java.util.Observable;
import java.util.Observer;


public class WindchillDisplay implements Observer, DisplayElement{

    Observable observable; 
    double windchill; 
    double tempInF = 78.33456;
    double tempInC;
    double windSpeedMPH = 12.334857;
    double windSpeedMS;

    public WindchillDisplay(Observable observable){
        this.observable = observable;
        observable.addObserver(this);
    }

    public void update(Observable obs, Object arg){
        if(obs instanceof WeatherData){
            //main code goes here!!!!
            tempInC = (5/9)*(tempInF - 32);
            windSpeedMS = .44704 * windSpeedMPH;
            windchill = ((12.1452 + 11.6222 * ((int) Math.sqrt(windSpeedMS)) - 1.162;
            display(); 
        }
    }

    public void display(){
        System.out.printf("The wind speed is: %f watts/meter^^2 %n", windSpeedMS);
    }
 
     
}
