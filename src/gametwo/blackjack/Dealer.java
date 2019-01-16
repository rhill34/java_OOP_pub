package gametwo.blackjack;

import java.util.ArrayList;

public class Dealer extends Player{
    private ArrayList<Chips> pay;
    private Table deal;

    Dealer()
    {
        super("House");
        this.pay = pay;
        this.deal = deal;
    }

    public ArrayList<Chips> getPay() {
        return pay;
    }

    public void setPay(ArrayList<Chips> pay) {
        this.pay = pay;
    }

    public Table getDeal() {
        return this.deal;
    }

    public void setDeal(Table deal) {
        this.deal = deal;
    }

    @Override
    public String toString() {
        return "Dealer{" +
                "pay=" + pay +
                ", deal=" + deal +
                '}';
    }
}
