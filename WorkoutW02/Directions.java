/*

	Author: Tyler Tripp and Nick Burkett.
	Date: 01/27/2021
	This is the Directions Class for the WorkOut2 assignment. 
*/

public class Directions {
	
	TravelStrategy travelStrategy; 
	double routeDistance;
	
	public Directions() {	
	    travelStrategy = new ByCar();
        routeDistance = travelStrategy.findRoute();
        travelStrategy.computeTimeEstimate();
    }
	
	public void changeStrategy(String strat) {

		if (strat == "car") {
		    travelStrategy = new ByCar();	
		}
		else if (strat == "walk") {
		    travelStrategy = new Walking();	
		}
		else if (strat == "transit"){
			travelStrategy = new MassTransit();	
		}
		
		travelStrategy.findRoute();
		travelStrategy.computeTimeEstimate();
        travelStrategy.co2Savings(routeDistance);

	}
	
	public void performDraw() {	

		travelStrategy.drawMap();

	}
	
	public void performFindRoute() {
        	
		routeDistance = travelStrategy.findRoute();

	}

}
