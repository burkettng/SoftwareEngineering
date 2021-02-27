import java.util.Observable;
import java.util.Observer;

public class GoatSimulator {

    public static void main(String[] args) {
        
        Goat goat01 = new Goat("Player01"); 
        Goat goat02 = new Goat("player02"); 
        PointDisplay pointDisplay = new PointDisplay(goat01);
        WinnerDisplay winnerDisplay = new WinnerDisplay(goat01);

        goat01.addPoints(100);
        goat02.addPoints(20);
        goat01.addPoints(100);
        goat01.addPoints(100);
        goat02.addPoints(200);
        goat01.addPoints(100);
        goat01.addPoints(100);
        goat02.addPoints(100);
        goat01.addPoints(100);
        goat01.addPoints(100);
        goat01.addPoints(305);
    }

}
