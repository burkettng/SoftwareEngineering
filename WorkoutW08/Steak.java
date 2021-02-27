public class Steak extends Topping {

    Pizza pizza;

    public Steak(Pizza pizza){
        this.wrappedPizza = pizza;
    }

	public String getDescription() {
		return  wrappedPizza.getDescription() + ", Steak";
	}
    
	public int getCalories(){
        return wrappedPizza.getCalories() + 9;
    }
}
