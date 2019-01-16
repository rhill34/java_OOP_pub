package gametwo.blackjack;

import cards.StandardCard;
import decks.StandardDeck;

import java.util.ArrayList;

public class Table {
//    fields
    private You player;
    private Dealer dealer;
    private StandardDeck shoe;
    private ArrayList<Chips> wager;
    private ArrayList<StandardCard> discard;
    private ArrayList<Chips> bonus;

//    constructor
    public Table(You player , StandardDeck shoe)
    {
        this.player = player;
        this.shoe = shoe;

    }

//    accessor

    public void setPlayer(You player) {
        this.player = player;
    }

    public void setDealer(Dealer dealer) {
        this.dealer = dealer;
    }

    public void setShoe(StandardDeck shoe) {
        this.shoe = shoe;
    }

    public void setWager(ArrayList<Chips> wager) {
        this.wager = wager;
    }

    public void setDiscard(ArrayList<StandardCard> discard) {
        this.discard = discard;
    }

    public void setBonus(ArrayList<Chips> bonus) {
        this.bonus = bonus;
    }
//    mutator

    public You getPlayer() {
        return this.player;
    }

    public Dealer getDealer() {
        return this.dealer;
    }

    public StandardDeck getShoe() {
        return this.shoe;
    }

    public ArrayList<Chips> getWager() {
        return this.wager;
    }

    public ArrayList<StandardCard> getDiscard() {
        return this.discard;
    }

    public ArrayList<Chips> getBonus() {
        return this.bonus;
    }

//    toString

    @Override
    public String toString() {
        return "Table{" +
                "player=" + this.player.getName() +
                ", dealer=" + this.dealer.getName() +
                ", shoe=" + this.getShoe().cardCount() +
                ", wager=" + this.getWager() +
                ", discard=" + this.getDiscard() +
                ", bonus stack=" + this.getBonus() +
                ", Chips in the bonus=" + this.getBonus()+
                '}';
    }
}
