package polymorphicAnts;


/**
 * Grey Ants
 *
 * 
 * @version 0.1
 * @since v0.0.7
 */
public interface greyAnt extends Ant{
    /**
     * Sets ant status to "Hybernate" for <code>Days</code> game ticks
     *
     * @param days Num of days in an integer.
     */
    public void hybernate(int days);
}
