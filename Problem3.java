 
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem3 extends Problem1
{
    public Problem3(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void exit() {
        putBeeper();
        turnLeft();
        move();
        turnRight();
    }
    public void closeAllWindows() {
        while(!facingNorth()) {
            turnLeft();
        }
        while(!nextToABeeper()) {
            checkWalls();
        }
    }
}

