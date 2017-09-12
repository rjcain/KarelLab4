
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class Problem1 extends Robot
{
    public Problem1(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public void turnRight() {
        turnLeft();
        turnLeft();
        turnLeft();
    }
    public void escapeRoom() {
        boolean insideRoom = true;
        while(frontIsClear()) {
            move();
        }
        while(insideRoom == true) {
            checkWalls();
        }
    }
    public void checkWalls() {
        if(frontIsClear()) {
            exit();
        }
        else {
            turnLeft();
            if(frontIsClear()) {
                //wall
                move();
                turnRight();
            }
            else {
                //corner
                turnLeft();
                move();
                turnRight();
            }
        }
    }
    public void exit() {
        move();
        move();
        boolean insideRoom = false;
    }
}

