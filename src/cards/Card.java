/*
 *
 * Robert Hill
 * 01.04.19
 * Card.java
 * Summary:
 * Abstract Card class to represents a playing card
 * in any type of card game
 *
 */
package cards;

/**
 * Abstract Card class to represents
 * a playing card in any type of card game
 *
 * @author Rob The King!
 * @version 1.0
 */
public abstract class Card {

//    fields
    private String cardText;

//    constructors
    /**
     * Constructor for the Card type object
     * -- can not directly instantiate Card object
     * @param cardText String type data that represents the card
     *                 description text
     */
    public Card(String cardText) { this.cardText = cardText; }

//    accessors
    /**
     * Method that returns the Card object
     * description text
     * @return String data type to represent the card
     *         description text
     */
    public String getCardText() { return cardText; }

//    mutator

//    toString

    @Override
    public String toString() { return getCardText(); }

}
