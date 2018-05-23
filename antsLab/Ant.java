
/**
 * All objects that are a "ant" implement this interface
 *
 * @author Malokai Persoff
 * @version 0.1
 * @since WIPE_1
 */
public interface Ant
{
    
    /**
     * Method eat  The ant eats <code>cal</code> Calories
     *
     * @param cal  The number of calories in the current piece of food 
     */
    public void eat(int cal);
    
    /**
     * Method die  The ant dies, causes its value in the ArrayList to be removed
     * 
     */
    public void die();
}
