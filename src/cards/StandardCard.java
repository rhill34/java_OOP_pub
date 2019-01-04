/*
 * Robert Hill
 * 01.04.19
 * StandardCard.java
 * Summary:
 * StandardCard extends Card class to represents a playing card
 * in Standard card game
 */
package cards;

/**
 * StandardCard extends Card class
 * to represents a playing card
 * in Set card game
 * @author Rob The King!
 * @version 1.0
 */
public class StandardCard extends Card {
//    fields
    private String rank;
    private String suit;

//    constructors

    /**
     * 
     */
    public StandardCard(String rank, String suit) {
        super(color +" "+ shading +"-"+color+" "+ number);
        this.rank = rank;
        this.suit = suit;
    }
//    accessors
    /**
     * Getter for the attribute of a card from the Set Game
     * @return String data type to represent the shape
     * of the Set Card type object
     *
     */
    public String getRank() { return rank; }

    /**
     * Getters for the attributes of a standard playing card
     * @return String data type to represent the shading
     * of the Standard Card type object
     *
     */
    public String getSuit() { return suit; }

    /**
     * Getter for the attribute of a card from the Set Game
     * @return String data type to represent the color
     * of the Set Card type object
     *
     */
    public String getColor() { return color; }
//    mutator
//    toString

    @Override
    public String toString() {
        return super.toString();
    }
}

