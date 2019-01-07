/*
 *
 * Robert Hill
 * 01.06.19
 * Deck.java
 * Summary: a deck represents two groups of cards, a dealer pile and a discard pile.
 * Cards are dealt to a player from the dealer pile and then placed in the discard pile
 * afterwards.
 *
 */
package decks;

import cards.Card;

import java.util.*;

/**
 * The Deck Class represents two groups of cards, a dealer pile and a discard pile.
 * Cards are dealt to a player from the dealer pile and then placed in the discard pile
 * afterwards.
 *
 * @author Rob The King!
 * @version 1.0
 */
public class Deck {
//     fields
    private List<Card> dealerPile;
    private List<Card> discardPile;

//     constructor

    /**
     * Constructor creates a new Deck object
     */
    public Deck (){
        this.dealerPile = new ArrayList<>();
        this.discardPile = new ArrayList<>();
    }

//     accessors

    /**
     * cardCount(): returns the number of cards in the dealer pile. (this is useful as
     * it tells you when you no longer have cards to deal to a player)
     *
     * @return integer data type to represent the amount of cards in the dealerPile
     */
    public int cardCount() { return dealerPile.size(); }

//     mutator

    /**
     * addCard(): adds a card to the dealer pile
     * @param card data type Card to represent the card being added to the dealerPile
     */
    public void addCard(Card card) { this.dealerPile.add(card); }

    /**
     * Moves all cards from the discard pile to the dealer pile.
     * Then randomizes the position of all cards in the dealer pile.
     */
    public void shuffle() {
//      Move all cards from the discard pile
        for(Card returnDiscard : this.discardPile)
        {
//             to the dealer pile.
            Collections.addAll(this.dealerPile,returnDiscard);
        }
//
//      make sure no duplicate cards from the dealerPile and the discardPile exist
        Set<Card> shuffleSet = new HashSet<>(this.dealerPile);

//      empty the dealerPile for fresh shuffle
        this.dealerPile.clear();
//      empty the discardPile
        this.discardPile.clear();

        for(Card shuffle : shuffleSet)
        {
//          add all of cards back to the Decks dealerPile
            Collections.addAll(this.dealerPile,shuffle);
        }

////    shuffle the Decks dealerPile
        Collections.shuffle(this.dealerPile);
    }

    /**
     * dealTopCard(): removes the "top" card from the dealer pile and places it in the
     * discard pile. Then returns the removed card.
     *
     * @return data type of a Card to represent a removed card from the dealer pile.
     */
    public Card dealTopCard(){

        Card topCard = ( this.dealerPile.isEmpty()) ?
                this.discardPile.remove(this.discardPile.size()-1) :
                this.dealerPile.remove(0);

        this.discardPile.add(topCard);
        return topCard;
    }

//     toString
    @Override
    public String toString() {
        String obj;

        String stars = "*****************\n";
        obj = this.dealerPile.size() + " cards in deck\n"+ stars;

        StringBuilder dealerCards = new StringBuilder();
        for( Card card : this.dealerPile) {

            dealerCards.append(card);
            dealerCards.append("\n");
        }

        obj += dealerCards.toString();

        obj += ("\n"+this.discardPile.size() + " cards in discard\n"+
                stars);

        StringBuilder discardCards = new StringBuilder();
        for( Card card : this.discardPile) {
            discardCards.append(card);
            discardCards.append("\n");
        }
        obj += discardCards.toString();

        return(obj);

    }

}
