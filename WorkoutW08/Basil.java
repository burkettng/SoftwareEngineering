public class Basil extends Topping {

    Pizza pizza;

    public Basil(Pizza pizza){
        this.wrappedPizza = pizza;
    }

	public String getDescription() {
		return  wrappedPizza.getDescription() + ", PineapBasilple";
	}
    
	public int getCalories(){
        return wrappedPizza.getCalories() + 1;
    }
}
