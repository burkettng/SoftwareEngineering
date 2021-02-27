public class Stevia extends CondimentDecorator {
	public Stevia(Beverage beverage) {
		this.beverage = beverage;
	}
 
	public String getDescription() {
		return beverage.getDescription() + ", Stevia";
	}
 
	public double cost() {
		return 0.25 + beverage.cost(); //I changed this to .25 for number 10 in the workout. 
	}
}