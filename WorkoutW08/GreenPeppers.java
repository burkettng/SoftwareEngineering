public class GreenPeppers extends Topping {

    Pizza pizza;

    public GreenPeppers(Pizza pizza){
        this.wrappedPizza = pizza;
    }

	public String getDescription() {
		return  wrappedPizza.getDescription() + ", Green Peppers";
	}
    
	public int getCalories(){
        return wrappedPizza.getCalories() + 2;
    }
}
