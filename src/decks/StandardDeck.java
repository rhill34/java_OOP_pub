/*
 *
 * Robert Hill
 * 01.06.19
 * StandardDeck.java
 * Summary: StandardDeck extends Deck to represent a standard 52-card deck of playing
 * cards.
 *
 */
package decks;

import cards.Card;
import cards.StandardCard;

/**
 * StandardDeck extends Deck to represent a standard 52-card deck of playing
 * cards.
 * @author Rob The King!
 * @version 1.0
 */
public class StandardDeck extends Deck {
//    fields

//    constructors
    /**
     * StandardDeck Constructor creates a standard 52-card deck with
     * each combination of the rank and suit values
     *
     * Here are the ranks in a standard deck - 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen,
     * King, Ace
     *
     * Here are the suits in a standard deck - Hearts, Diamonds, Spades, Clubs
     *
     */
    public StandardDeck() {
//     Here are the ranks in a standard deck - 2, 3, 4, 5, 6, 7, 8, 9, 10, Jack, Queen,
//     King, Ace
        String [] ranks = {"2","3","4","5","6","7","8","9","10","Jack","Queen",
                "King", "Ace"};
//     Here are the suits in a standard deck - Hearts, Diamonds, Spades, Clubs
        String [] suits = {"Hearts","Diamonds", "Spades","Clubs"};

//      for each combination of the rank and suit values
            for(String suit : suits){
                for(String rank : ranks){
                    Card standardCard = new StandardCard(rank, suit); //Creates a
                    // StandardCard object for the rank combination
                    super.addCard(standardCard);  // adds the Card to the parent Deck
                }
            }
    }

//    accessors
    @Override
    public StandardCard dealTopCard(){
        return (StandardCard) super.dealTopCard();
    }

//    mutator

//    toString
    @Override
    public String toString() {
        return super.toString();
    }
}
