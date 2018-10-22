package polymorphicAnts;



/**
 * Queen of Gray Ants
 *
 * 
 * @version 0.3
 * @since v0.0.7
 */
public class grayQueen implements GrayAnt
{
    private boolean isAlive = true;
    private int pos;
    private int dCal;
    private int calR = 1;
    private int stat = 0;
    // stats:
    //0=Regular/Alive
    //1=Hybernating
    //2=Hurt(low impact)
    //3=Hurt(Uncon.)
    //4=Hurt(Bleeding)
    //5=Dying (Able to save)
    //6=Mortaly wounded
    private int statTime = 0;
    //statTime= time until stat wears off
    /**
     * grayQueen Constructor
     *
     * @param pos position
     * @param dCal digested Calories, total number of calories usable.
     */
    public grayQueen(int pos, int dCal){
        this.pos = pos;
        this.dCal = dCal;
    }
        /**
         * grayQueen Constructor
         *
         * @param pos position
         * @param dCal Digested Calories, total number of calories usable.
         * @param calR Calories required per day
         */
        public grayQueen(int pos, int dCal, int calR){
        this.pos = pos;
        this.dCal = dCal;
        this.calR = calR;
    }
    public int getdCal(){
       return this.dCal; 
    }
    public void hybernate(int days){
        if(!(stat > 1)){
            statTime = days;
            stat = 1;
        }
    }
    public boolean willDie(){
        if(stat == 1){
            if(dCal<calR/2){
                stat = 0;
                statTime = 0;
                return false;
            }else{
                return false;
            }
        }
        else if(dCal<calR){
            return true;
        }else if(stat==6){
            return true;
        }else{
            return false;
        }
    }
    public void eat(int cal){
        dCal+=cal;
        dCal-=calR;
    }
    /**
     * Method layEgg - NOT USED AT MOMENT!
     *
     * @param eggNum Number of eggs for the queen to lay
     * @param eggPos Position of egg in colony
     */
    public void layEgg(int eggNum, int eggPos){
        
    }
}
