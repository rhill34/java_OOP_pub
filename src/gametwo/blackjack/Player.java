/*
 * Robert Hill
 * 01.14.19
 * Player.java
 * Summary: Player class contains the fields and methods to represent a player in the
 * Blackjack game.
 *
 */

package gametwo.blackjack;

import cards.StandardCard;

import java.util.*;

import static java.lang.Integer.valueOf;

/**
 * Player class contains the fields and methods to represent a player in the
 * Blackjack game.
 *
 * @author Rob The King!
 * @version 1.0
 */
public class Player {
    public static final int BLACKJACK = 21;
    //    fields
    private Stand stand;
    private boolean play = false;
    private ArrayList<StandardCard> hand;
    private int point = 0;
    private String name;
    private Sign sign;
    private ArrayList<Chips> wallet;
//    private Table table;

//    constructor

    /**
     * Constructor of a Player object
     * @param name
     */
    public Player(String name)
    {
        this.name = name;
        this.hand = new ArrayList<>();
        this.wallet = new ArrayList<>();
//        this.table =
    }
//    accessors
    public int getPoint()
    {
        return this.point;
    }

    public ArrayList<Chips> getWallet()
    {
        return this.wallet;
    }

    public ArrayList<StandardCard> getLookAtCards()
    {
        return this.hand;
    }

    public boolean getPlay()
    {
        return this.play;
    }

    public Sign getSign()
    {
        return this.sign;
    }

    public ArrayList<StandardCard> getHand() {
        return this.hand;
    }



    //    mutator
    public void setWallet(ArrayList<Chips> chips )
    {
        this.wallet = chips;
    }

    public void setSign(Sign sign)
    {
        this.sign = sign;
    }

    public Stand getStand() {
        return stand;
    }

    public void setStand(Stand stand)
    {
        this.stand = stand;
    }

    public String getName() {
        return this.name;
    }

    public void setHand(StandardCard dealt) { this.hand.add(dealt); }

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
                return 11;
            }
            else {
                return 10;
            }
        }

    }

    public void setPoint(ArrayList <StandardCard> hand) {
        this.hand = hand;
        int count = 0;
        for (StandardCard these : this.hand)
        {
            count =+ makePoint(these.getRank());
        }
        this.point += count;


    }

    //    toString

    @Override
    public String toString() {
        return "Player{" +
                "stand=" + stand +
                ", play=" + play +
                ", hand=" + hand +
                ", point=" + point +
                ", name='" + name + '\'' +
                ", sign=" + sign +
                ", wallet=" + wallet +
                '}';
    }
}
