/*

	Author: Tyler Tripp and Nick Burkett.
	Date: 01/27/2021
	This is the Walking Class for the WorkOut2 assignment. 
*/

import java.util.Random;
public class Walking extends TravelStrategy{
    public Walking(){
    }

    public void drawMap(){
        System.out.println("Map for travelling by Walking.");
    }

    public double findRoute(){
        System.out.println("Computing a route for travelling by Walking...");
        Random rand = new Random();
        return rand.nextDouble() * 1000;
    }

    public void computeTimeEstimate(){
        System.out.println("Computing time estimate for travelling by Walking...");
    }

    public void co2Savings(double distance){
        System.out.println("100% Savings. You kept " + (distance * 404) + " grams of CO2 out of " + 
            "Besides that, you are healthier for it.");    
    }
}
