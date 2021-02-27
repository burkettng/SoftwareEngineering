/*

	Author: Tyler Tripp and Nick Burkett.
	Date: 01/27/2021
	This is the ByCar Class for the WorkOut2 assignment. 
*/

import java.util.Random;
public class ByCar extends TravelStrategy{
    public ByCar(){
    }

    public void drawMap(){
        System.out.println("Map for travelling by Car.");
    }

    public double findRoute(){
        System.out.println("Computing a route for travelling by Car...");
        Random rand = new Random();
        return rand.nextDouble() * 1000;
    }

    public void computeTimeEstimate(){
        System.out.println("Computing time estimate for travelling by Car...");
    }

    public void co2Savings(double distance){
        System.out.println("You will emit " + distance * 404 + " grams of CO2 to the atmosphere");
    }
}
