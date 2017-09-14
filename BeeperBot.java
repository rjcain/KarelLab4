
import kareltherobot.*; 


/**
 * @author :  D. Appel
 */
public class BeeperBot extends Robot
{
    public BeeperBot(int st, int av, Direction dir, int numBeepers) {
        super(st, av, dir, numBeepers);
    }
    public int beeperV = 0;
    public void runRace() {
        while(frontIsClear()){
            move();
            checkSteeple();
        }
        turnOff();
        System.out.println("Nice! Karel picked up " + beeperV + " beepers.");
    }
    public void checkSteeple() {
        if(nextToABeeper()){
            turnLeft();
            while(nextToABeeper()){
                pickBeeper();
                beeperV++;
                move();
            }
            turnLeft();
            turnLeft();
            while(frontIsClear()){
                move();
            }
            turnLeft();
        }
    }
}