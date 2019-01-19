/*
 * Robert Hill
 * 01.14.19
 * Player.java
 * Summary: Player class contains the fields and methods to represent a player in the
 * Blackjack game.
 *
 */
//packages
package minimumblackjack.players;

//imports
import cards.StandardCard;
import java.util.*;

/**
 * Player class contains the fields and methods to represent a player in the
 * Blackjack game.
 *
 * @author Rob The King!
 * @version 1.0
 */
public class Player {
    //fields
    /**
     * Constant to represent the magic number for Blackjack
     */
    public static final int BLACKJACK = 21;
    /**
     * Constant Variable to represent the integer for a StandardCard with the rank of an
     * Ace
     */
    public static final int HARD_ACE = 11;
    private ArrayList<StandardCard> hand;
    private int point = 0;
    private String name;

    //    constructor
    /**
     * Constructor of a Player object
     * @param name String data type to represent the name of a Player
     */
    public Player(String name)
    {
        this.name = name;
        this.hand = new ArrayList<>();
    }

    //    accessors
    /**
     * Gets the sum of points that a Player object has based on Rank
     * @return integer data type to represent the player score
     */
    public int getPoint()
    {
        return this.point;
    }

    /**
     * Get the array of StandardCards for the Player
     * @return ArrayList of StandardCards data type that represents the StandardCards
     * in a players hand
     */
    public ArrayList<StandardCard> getHand()
    {
        return this.hand;
    }

    //    mutator
    /**
     * Get the name of the Player object
     *
     * @return String data type that represents the name of the Player object
     */
    public String getName()
    {
        return this.name;
    }

    /**
     * Sets StandardCard into Players Hand
     *
     * @param dealt StandardCard data type that represents a card taken in to the
     *              Players hand
     */
    public void setHand(StandardCard dealt)
    {
        this.hand.add(dealt);
    }

    /**
     * Converts a card rank to a point for player score and *Turns Ace to either 1 or 11
     * @param card String data type that represents a cards rank assignment
     * @return integer data type that represents the number to add to the players score
     */
    public int makePoint(String card)
    {
        try
        {
            Integer.parseInt(card);

            // is a valid integer
            return Integer.parseInt(card);
        }
        catch (NumberFormatException ex)
        {
            //is not an integer
            if(card.contains("Ace") && this.getPoint() > 10 && this.getPoint() <= BLACKJACK) {
                return 1;
            }
            else if(card.contains("Ace") && this.getPoint() <= 10 && this.getPoint() <= BLACKJACK)
            {
                return HARD_ACE;
            }
            else {
                return 10;

            }
        }

    }

    /**
     * Sets the score of a Player based on the StandardCards in a ArrayList of
     * StandardCards
     *
     * @param hand ArrayList of StandardCards that represents the cards to count for
     *             the players score
     */
    public void setPoint(ArrayList <StandardCard> hand)
    {
        this.hand = hand;
        int count = 0;
        for (StandardCard these : this.hand)
        {
            count =+ makePoint(these.getRank());
        }
        this.point += count;


    }

    /**
     * Resets the Players hand
     */
    public void resetHand()
    {
        //Clear
        this.hand.clear();
    }

    /**
     * Resets the Score of the Player
     */
    public void resetCount()
    {
        this.point = 0;
    }

    //    toString
    /**
     * String to check the state of a Player object
     *
     * @return String data type that represents a Player object
     */
    @Override
    public String toString() {
        return "Player{" +
                ", hand=" + hand +
                ", point=" + point +
                ", name='" + name + '\'' +
                '}';
    }
}
