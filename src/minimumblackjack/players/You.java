/*
 * Robert Hill
 * 01.14.19
 * You.java
 * Summary: You class extends Player class to represent the user.
 *
 */
package minimumblackjack.players;

/**
 * You class extends Player class to represent the user.
 *
 * @author Rob The King!
 * @version 1.0
 */
public class You extends Player {
    //    fields
    //    construct
    /**
     * Constructor to instantiate a You class object
     * @param name String type data to represent a handle for a player in the Blackjack
     *            game.
     */
    public You(String name)
    {
        super(name);

    }
    //    accessor

    //  toString

    @Override
    public String toString() {
        return super.toString()+"You{" +
                '}';
    }
}
