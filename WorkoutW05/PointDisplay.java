import java.util.Observable;
import java.util.Observer;

public class PointDisplay implements Observer
{
    Observable observable; 
    private String goatName;
    private int currentPoints;

    public PointDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);

    }

    public void update(Observable obs, Object arg) {

        if(obs instanceof Goat){
            Goat goat = (Goat)obs;
            if (this.currentPoints > 1000){
                display();
            }

        }
    }
    
    public void display() {
		System.out.println(goatName + " ate something and now has " + currentPoints + " points.");
	}
}
