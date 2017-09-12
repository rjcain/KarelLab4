
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem2 extends Robot
{
    public Problem2(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void plantBeepers() {
        while(!nextToABeeper()) {
            surroundWall();
        }
    }
    public void surroundWall() {
        if(frontIsClear()) {
            turnLeft();
            if(frontIsClear()) {
                putBeeper();
                move();
                putBeeper();
                turnLeft();
                move();
            }
            else{
                turnRight();
                putBeeper();
                move();
            }
        }
        else {
            turnRight();
            putBeeper();
            move();
        }
    }
}

