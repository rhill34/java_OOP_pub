/*
 * Robert Hill
 * 01.14.19
 * Blackjack.java
 * Summary: Blackjack class contains the console program logic of the game play
 *
 */
package gametwo.blackjack;

import cards.StandardCard;
import decks.StandardDeck;

/**
 * Blackjack class contains the console program logic of the game play
 *
 * @author Rob The King!
 * @version 1.0
 */
public class Blackjack {
    /**
     * Constant for a loop to print the stars for the user Welcome to the game
     */
    public static final int START = 40;
    /**
     * Constant to represent the number 21 for Blackjack
     */
    public static final int BLACKJACK = 21;
    private static Table table;
    private static Dealer dealer;
    private static You user;
    private static StandardDeck shoe;
    private static StandardCard dealt;
    private static Console console = new Console();
    private static String name;

    /**
     * Method to enter into the program application
     * @param args String type array of data to represent commands to run the program
     */
    public static void main(String [] args)
    {
        firstWelcome();
//********************************************************************//
        getYouUser();
        sitAtTable();
//        user.getWallet().add();

        runGame();




    }

    private static void firstWelcome()
    {
//      Welcome user to the Program
        StringBuilder stars = new StringBuilder("Welcome to my Blackjack Console " +
                "program!\n");
        for (int i = 0; i < START; i++)
        {
            stars.append("*");
        }
        stars.append("\n");

//        generate new deck
        shoe = new StandardDeck();
        String initDeck = "Generated a new Deck...\n";

//       shuffle the new deck
        shoe.shuffle();
        String initShuffle = "Shuffled Deck...\n";

      System.out.println(stars.toString() + initDeck + initShuffle);
    }

    private static void getYouUser()
    {
        //        Get the users name
        String name = console.getString("Enter your Blackjack Player name? ");
        name = name.substring(0, 1).toUpperCase()+name.substring(1);
        user = new You(name);
        System.out.println("Welcome to the Blackjack table " + user.getName());
    }

    private static void sitAtTable()
    {
//      Generate a table for blackjack
        table = new Table(user, shoe);
        dealer = new Dealer();
        dealer.setDeal(table);
        table.setDealer(dealer);
    }

    private static void userHit()
    {
//        hit player
        dealt = (table.getShoe().dealTopCard());
        table.getPlayer().setHand(dealt);
        System.out.println(table.getPlayer().getName() +", you are dealt a " + dealt) ;
        table.getPlayer().setPoint(table.getPlayer().getHand());
    }

    private static void dealerShows()
    {
        //        Dealer shows
        dealt = (table.getShoe().dealTopCard());
        table.getDealer().setHand(dealt);
        System.out.println(table.getDealer().getName() + ", dealer is shows a " + dealt);

    }

    private static void usersChoice()
    {
        String userChoice =
                console.getString(user.getName()+ ", your total is " + table.getPlayer().getPoint() +
                        " , hit? y/N");
        System.out.println(userChoice);
        switch (userChoice.toLowerCase())
        {
            case "y":
                userHit();
                if(table.getPlayer().getPoint() < BLACKJACK) { usersChoice(); }
                else if(table.getPlayer().getPoint() > BLACKJACK) {
                    System.out.println("Sorry "+ user.getName() + ", you BUSTED!");
                    gameSwitch();
                }
                else {
                    System.out.println(
                            user.getName() + ", you have a BlackJack! Please wait for " +
                                    "the dealer to reveal their cards");
                }
                break;
            case "n":
                System.out.println(user.getName() +", your total is " + user.getPoint() +
                        " and " +
                        "your hand is a " + user.getHand().toString());
                break;

            default:
                usersChoice();

        }
    }

    private static void hitDealer()
    {
        dealt = (table.getShoe().dealTopCard());
        table.getDealer().setHand(dealt);
        System.out.println(table.getDealer().getName() +", dealer dealt a " + dealt) ;

        table.getDealer().setPoint(table.getDealer().getHand());
        System.out.println(dealer.getName()+ ", dealers total is " + dealer.getPoint());

        if(dealer.getPoint() < BLACKJACK) { hitDealer(); }
        else if(dealer.getPoint() == BLACKJACK && user.getPoint() != BLACKJACK) {
            System.out.println(user.getName() + "you lost to the " + dealer.getName() +
                    "!");

        }
        else if(dealer.getPoint() == BLACKJACK && user.getPoint() == BLACKJACK) {
            System.out.println(user.getName() + "you and the " + dealer.getName() +
                    " dealer PUSH.");

        }
        else {
            System.out.println(user.getName() + "you won the " + dealer.getName() + " " +
                    "BUSTED!");
        }
        gameSwitch();
    }

    private static void runGame()
    {
        System.out.println(table.toString());
//        Start a Player hand
        for (int i = 0; i < 2; i++)
        {
//            hit player
            userHit();
        }

        dealerShows();

//      Prompt user for a choice
        usersChoice();
//      Dealer turn
        //        hit dealer
        hitDealer();
        runGame();
    }

    private static void gameSwitch()
    {
        String userGame =
                console.getString(user.getName()+ ", do you want to play again? y/N");
        if (userGame.toLowerCase().equals("y")) { runGame(); }
        else { System.out.println("Thank you," + user.getName() + "for playing my " +
                        "Blackjack Console game?"); }
    }
}