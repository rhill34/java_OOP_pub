/*
 * Robert Hill
 * 01.06.19
 * StandardDeck.java
 * Summary: StandardDeck extends Deck to represent a standard 52-card deck of playing
 * cards.
 *
 */
package game;

import decks.Deck;
import decks.StandardDeck;

import static game.Console.getInt;


/**
 * It is expected that you provide a test program with your classes.
 *
 * @author Rob The King!
 * @version 1.0
 */
public class Test
{
//    fields
    private static Deck testDeck =  new StandardDeck();
//    private static Console console = new Console();

    /**
     * Main method to access the entry point of this program
     * @param args String type Array of command line arguments
     */
    public static void main(String [] args) {
        menu();

    }

    private static void shuffleDeckAgain() {
        System.out.println("Shuffled Deck again...");
        testDeck.shuffle();
        System.out.println(testDeck.toString());
    }

    private static void dealingFewCards() {
        System.out.println("Dealing a few cards...\n");
        System.out.println("Dealt a " + testDeck.dealTopCard());
        System.out.println("Dealt a " + testDeck.dealTopCard());
        System.out.println("Dealt a " + testDeck.dealTopCard());
        System.out.println(testDeck.toString());
    }

    private static void shuffledDeck() {
        System.out.println("Shuffled Deck...");
        testDeck.shuffle();
        System.out.println(testDeck.toString());
    }

    private static void creatingDeck() {
        System.out.println("Creating Deck...");
        testDeck = new StandardDeck();
        System.out.println(testDeck.toString());
    }

    private static void menu() {

        String prompt1 = "Enter 1 : To create a Deck\n";
        String prompt2 = "Enter 2 : To Shuffle Deck\n";
        String prompt3 = "Enter 3 : To deal a few cards\n";
        String prompt4 = "Enter 4 : To shuffle the Deck again (this will reset the " +
                "both decks)\n";
        String prompt5 = "Enter 5 : To get the amount of cards left in the deck\n";

        System.out.println("Card Game Test Menu");
        int play =
                getInt(prompt1 + prompt2 + prompt3 + prompt4 + prompt5);

        switch(play) {
            case 1:
                creatingDeck();
                break;
            case 2:
                shuffledDeck();
                break;
            case 3:
                dealingFewCards();
                break;
            case 4:
                shuffleDeckAgain();
                break;
            default:
                System.out.println("The deck has "+ testDeck.cardCount() + "cards now.");
        }
        menu();
    }
}
