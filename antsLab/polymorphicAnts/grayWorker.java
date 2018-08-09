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
