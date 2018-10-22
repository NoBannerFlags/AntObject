package polymorphicAnts;
import java.util.*;


public class sim{
    private int cFood = 0; //Colony's food
    private int dayNum = 0; //Number of "Days" or ticks the game has been active.
    /**
     * Method findsFood - an ant finds food
     *
     * @param foodAmt amount of food found
     */
    public void findsFood(int foodAmt, grayWorker ant){
        ant.findFood(foodAmt);
    }
    public static void main(String[] args){
        int curPos = 1;
        ArrayList<GrayAnt> antList = new ArrayList<GrayAnt>();
        grayQueen queen = new grayQueen(0,100); //makes a new queen
        antList.add(queen); //adds the queen to the list
        antList.add(new grayWorker(5, curPos)); //the same, but with a worker
        curPos++;
    }
}

