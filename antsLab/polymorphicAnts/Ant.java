package polymorphicAnts;
/**
 * All objects that are a "ant" implement this interface
 *
 * @author Malokai Persoff
 * @version 0.2
 * @since WIPE_1
 */
public interface Ant
{
    
    /**
     * The ant eats <code>cal</code> Calories
     * @since 0.1
     * @param cal  The number of calories in the current piece of food 
     */
    public void eat(int cal);
    
    /**
     * The ant dies, causes its value in the ArrayList to be removed
     * @since 0.1
     */
    public void die();
}
