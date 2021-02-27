
//Author: Nick Burkett.... Missed class on Monday so I...
//...do not have a partner. 

public class PizzaTest {

    /** Code to test Pizza **/
	public static void main(String[] args) {
        Pizza pizza = new PestoCrust();
        pizza = new Cheese(pizza);
        pizza = new Cheese(pizza);
        pizza = new GreenPeppers(pizza);
        pizza = new Steak(pizza);
        pizza = new Basil(pizza);
        pizza = new Pineapple(pizza);
        System.out.println("Description:  " + pizza.getDescription());
        System.out.println("Calories: " + pizza.getCalories());
    }
}
