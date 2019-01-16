/*
 * Robert Hill
 * 01.14.19
 * You.java
 * Summary: You class extends Player class to represent the user.
 *
 */
package gametwo.blackjack;

import java.util.ArrayList;

/**
 * You class extends Player class to represent the user.
 *
 * @author Rob The King!
 * @version 1.0
 */
public class You extends Player {
//    fields

    private ArrayList<Chips> bet;
    private Player split;
    private Player doubleDown;

//    construct

    /**
     * You class object
     * @param name
     */
    public You(String name)
    {
        super(name);
        this.split = new Player(name);
        this.doubleDown = new Player(name);
    }

//    accessor

    public ArrayList<Chips> getBet() {
        return bet;
    }

    public void setBet(ArrayList<Chips> bet) {
        this.bet = bet;
    }

    public Player getSplit()
    {
        return split;
    }

    public void setSplit(Player split)
    {
        this.split = split;
    }


    public void setDoubleDown(Player doubleDown)
    {
        this.doubleDown = doubleDown;
    }

//    mutator
    public Player getDoubleDown()
    {
        return doubleDown;
    }

//    toString

    @Override
    public String toString() {
        return super.toString()+"You{" +
                "bet=" + bet +
                ", split=" + split +
                ", doubleDown=" + doubleDown +
                '}';
    }
}
