/*

	Author: Tyler Tripp and Nick Burkett.
	Date: 01/27/2021
	This is the TYravelStrategy Class for the WorkOut2 assignment. 
*/

public abstract class TravelStrategy {
	
	public abstract void drawMap();
	
	public abstract double findRoute();
	
	public abstract void computeTimeEstimate();

    public abstract void co2Savings(double savings);
}
