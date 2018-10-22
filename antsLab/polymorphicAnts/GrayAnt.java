package polymorphicAnts;


/**
 * Grey Ants are a type of <code>Ant</code> and all types of grey ant Implement <code>GreyAnt</code>
 *
 * 
 * @version 0.3
 * @since v0.0.7
 */
public interface GrayAnt extends Ant{
    /**
     * Sets ant status to "Hybernate" for <code>Days</code> game ticks
     *
     * @param days Num of days in Hybernation.
     * @since 0.1
     */
    public void hybernate(int days);
}
