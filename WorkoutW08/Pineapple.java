public class Pineapple extends Topping {

    Pizza pizza;

    public Pineapple(Pizza pizza){
        this.wrappedPizza = pizza;
    }

	public String getDescription() {
		return  wrappedPizza.getDescription() + ", Pineapple";
	}
    
	public int getCalories(){
        return wrappedPizza.getCalories() + 10;
    }
}
