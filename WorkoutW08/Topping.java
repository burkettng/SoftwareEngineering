
public abstract class Topping extends Pizza {
    protected Pizza wrappedPizza;

    abstract public String getDescription();

    abstract public int getCalories();
}
