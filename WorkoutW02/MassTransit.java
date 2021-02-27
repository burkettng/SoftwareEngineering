/*

	Author: Tyler Tripp and Nick Burkett.
	Date: 01/27/2021
	This is the MassTransit Class for the WorkOut2 assignment. 
*/

import java.util.Random;
public class MassTransit extends TravelStrategy{
    public MassTransit(){
    }

    public void drawMap(){
        System.out.println("Map for travelling by MassTransit.");
    }

    public double findRoute(){
        System.out.println("Computing a route for travelling by MassTransit...");
        Random rand = new Random();
        return rand.nextDouble() * 1000;
    }

    public void computeTimeEstimate(){
        System.out.println("Computing time estimate for travelling by MassTransit...");
    }

    public void co2Savings(double distance){
        System.out.println("You will save 25% of the CO2 that would have been emitted " +
            "by driving a car. You will keep " + (distance * 404 * 0.25) + "grams of CO2 out of the atmosphere.");
    }
}
