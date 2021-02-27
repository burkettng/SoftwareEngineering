public class Cheese extends Topping {

    Pizza pizza;

    public Cheese(Pizza pizza){
        this.wrappedPizza = pizza;
    }

	public String getDescription() {
		return  wrappedPizza.getDescription() + ", Cheese";
	}
    
	public int getCalories(){
        return wrappedPizza.getCalories() + 15;
    }
}
