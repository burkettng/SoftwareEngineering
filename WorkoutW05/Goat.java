import java.util.Observable;
//import java.util.Observer;

public class Goat extends Observable {

String goatName; 
int score; 


public Goat (String nameVar){
    //this.observable = observable;
    //observable.addObserver((Observer) this);
    goatName = nameVar; 
    score = 0;
}

public void measurementsChanged(){
        setChanged();
        notifyObservers();
}

public void addPoints(int n) {
    if (n > 0)
    {
        score += n;
        setMeasurements();
    }
}

public void setMeasurements(String nameVar, int scoreVar){
    this.goatName = nameVar; 
    this.score = scoreVar;
    measurementsChanged();
}

public String getName() {
    return goatName;
}

public int getScore() {
    return score;
}

}