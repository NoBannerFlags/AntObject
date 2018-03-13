public interface Ant{
    public void eat(int foodType);
    /*Food types:
    *1: Leaf
    *2: Fungus
    *3: Honey
    *4: Sugar
    *5: Junk (Human trash)
    *6: Inset bits
    *7: Small insect
    *8: Meat
    *9: Other waste
    *10: Other liquid
    *11: Other scavenge
    *12: Other prey
    **/
    public String sense();
    public void bite(int bitepower, String target);
}
