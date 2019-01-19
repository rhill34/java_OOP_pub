/*
 * Robert Hill
 * 01.17.19
 * Player.java
 * Summary: Dealer class extends Player class and contains the the fields and methods to
 * represent the table dealer in  the Blackjack Console game program.
 *
 */
package minimumblackjack.players;

//imports
import minimumblackjack.Table;

/**
 * Dealer class extends Player class and contains the the fields and methods to
 * represent the table dealer in  the Blackjack Console game program.
 *
 * @author Rob The King!
 * @version 1.0
 */
public class Dealer extends Player
{
    //fields
    private Table deal;

    //constructors
    /**
     * Constructor that instantiate a Dealer class object and assigns the table Dealer
     * the name House
     */
    public Dealer()
    {
        super("House");
    }

    //  mutator

    //  accessor
    /**
     * Sets the table that the dealer is associated with
     *
     * @param deal Table data type that represents the table the dealer is assigned to.
     */
    public void setDeal(Table deal)
    {
        this.deal = deal;
    }

    // toString
    /**
     * String to represent the state of the Dealer object
     *
     * @return String data type that represent the state of the Dealer object.
     */
    @Override
    public String toString() {
        return "Dealer{" +
                ", deal=" + deal +
                '}';
    }
}
