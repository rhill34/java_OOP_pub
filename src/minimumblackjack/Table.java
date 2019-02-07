/*
 * Robert Hill
 * 01.17.19
 * Player.java
 * Summary: Table class contains the fields and methods to represent a Blackjack Table
 *  in  the Blackjack Console game program.
 *
 */
//packages
package minimumblackjack;

//imports
import cards.StandardCard;
import decks.StandardDeck;
import minimumblackjack.players.Dealer;
import minimumblackjack.players.You;
import java.util.ArrayList;

/**
 * Table class contains the fields and methods to represent a Blackjack Table
 * in the Blackjack Console game program.
 *
 * @author Rob The King!
 * @version 1.0
 */
public class Table {
    //    fields
    private You player;
    private Dealer dealer;
    private StandardDeck shoe;
    private ArrayList<StandardCard> discard;

    //    constructor
    /**
     * Constructor to instantiate a Table object from the Table Class.
     *
     * @param player Player type data to represent Player assigned to the table game
     *              form Blackjack
     * @param shoe StandardDeck type data that contains StandardCards used in the
     *             table game of Blackjack
     */
    public Table(You player , StandardDeck shoe)
    {
        this.player = player;
        this.shoe = shoe;
        this.discard = getDiscard();
    }

    //    accessor

    /**
     * Method to set the dealer role on the table
     *
     * @param dealer Dealer type data to represent the dealer of the table
     */
    public void setDealer(Dealer dealer)
    {
        this.dealer = dealer;
    }

    /**
     * Sets the Standard Deck that is used to operate the table game.
     *
     * @param shoe StandardDeck type data to represent the Deck used to play the
     *             Blackjack game.
     */
    public void setShoe(StandardDeck shoe)
    {
        this.shoe = shoe;
    }

    /**
     * Sets the discard deck of StandardCards for the table to operate a game.
     * @param discard ArrayList of StandardCard data type that represents the discard
     *                pile for the table console game.
     */
    public void setDiscard(ArrayList<StandardCard> discard)
    {
           this.discard = discard;
    }

    //    mutator

    /**
     * Gets the Player object that is represents the user of the table console game
     *
     * @return You data type that represents the user of the table
     */
    public You getPlayer()
    {
        return this.player;
    }

    /**
     * Gets the Dealer object that is represents the dealer of the table console game
     *
     * @return Dealer data type that represents the dealer of the table
     */
    public Dealer getDealer() {
        return this.dealer;
    }

    /**
     * Gets the StandardDeck object that is used for the table console game
     *
     * @return StandardDeck data type that represents the active table Playing deck
     */
    public StandardDeck getShoe()
    {
        if(this.shoe.cardCount() == 0)
        {
            this.shoe = new StandardDeck();
            this.shoe.shuffle();
            setShoe(this.shoe);
        }
        return this.shoe;
    }

    /**
     * Gets the Discarded Card deck from the table playing deck
     *
     * @return ArrayList of StandardCards that represents the cards used from the
     * table playing cards
     */
    public ArrayList<StandardCard> getDiscard()
    {
        return this.discard;
    }

//    toString
    /**
     * String to print out the state of the table object
     **/
    @Override
    public String toString() {
        return "Table{" +
                "player=" + this.player.getName() +
                ", dealer=" + this.dealer.getName() +
                ", shoe=" + this.getShoe().cardCount() +
                ", discard=" + this.getDiscard() +
                '}';
    }
}
