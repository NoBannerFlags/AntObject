package polymorphicAnts;


/**
 * Write a description of class grayWorker here.
 *
 * 
 * @version (0.1)
 * @since (0.0.8)
 */
public class grayWorker implements GreyAnt{
    
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
    public grayWorker(int dCal, int pos){
        this.dCal=dCal;
        this.pos=pos;
    }
    public void hybernate(int days){
        if(!(stat > 1)){
            statTime = days;
            stat = 1;
        }
    }
    /**
     * Method findFood - the worker finds some food, <code>eat</code> as much as it can and gaining <code>dCal</code>. Any food over 2 is given to the colony.
     *
     * @param fNum Food number (ammount of food)
     * @returns Amount of food given to colony
     */
    public int findFood(int fNum){
        if(fNum>2){
            eat(2);
            fNum-=2;
            return fNum;
        }else{
            
            eat(fNum);
            return 0;
        }
    }
    /**
     * Method giveFood - give food to a <code>Subject</code> if not enough food to give, give all and enter mortal wound state for 20 ticks.
     *
     * @param numb Amount of food to give to subject
     * @return Amount of food actually given
     */
    public int giveFood(int numb){
        if(dCal-numb<0){
            this.stat = 6;
            this.statTime = 20;
            return dCal;
            
        }else{
            return numb;
        }
    }
    public void eat(int cal){
        dCal+=cal;
        dCal-=calR;
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
}
