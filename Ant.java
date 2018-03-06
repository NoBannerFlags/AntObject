public interface Ant{
    public void eat(int foodType);
    /*Food types:
    1: Leaf
    2: Fungus
    3: Honey
    4: Sugar
    5: Junk (Human trash)
    6: Inset bits
    7: 
    
    **/
    public String sense();
    public void bite(int bitepower, String target);
}
