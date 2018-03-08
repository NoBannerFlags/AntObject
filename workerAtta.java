import java.util.*;
public class WorkerAtta{
  //amount of food the ant has. at 10 food, it becomes hungry, at 0 it dies.
  private int foodLevel;
  //the rate at which the ant's food reserves deteriorate, defaults to 1.
  private int metabolism = 1;
  //age of the ant in days, dies at 30, defaults to 0.
  private int antAge = 0;
  private boolean hungerSatisfied;
  private boolean isGrown;
  public void cutGreens(){
    //metabolism rate increases.
    matabolism++;
    //subtract metabolism from food.
    foodLevel-=metabolism;
    //age the ant up
    antAge ++;
  }
}
