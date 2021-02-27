/*

	Author: Tyler Tripp and Nick Burkett.
	Date: 01/27/2021
	This is the Client Class for the WorkOut2 assignment. 
*/

public class Client {
	
	public static void main(String[] args) {
			
		Directions d1;
		Directions d2; 
		Directions d3;
		
        d1 = new Directions();
        d2 = new Directions();
        d3 = new Directions();

        d1.performDraw();
        d2.performDraw();
        d3.performDraw();

        d2.changeStrategy("walk");
        d3.changeStrategy("transit");	
	    

    }

/*
 *
 * ByBicycle would need to be a new class that overrides the methods of the TravelStrategy 
 * class similarly to the other 3. Changing the new methods that override to the Bicycle CO2 savings, map, and route.
 *
 */

}
