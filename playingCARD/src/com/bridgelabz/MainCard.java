package com.bridgelabz;

public class MainCard {
    private static final String[] suits = { "Spades", "Hearts", "Diamond", "Clubs" };
    private static final String[] rank = { "Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King" };
    private static final String[][] deckOfCards = { suits, rank };
    private static final Card[] deck = new Card[52];

    public static void main(String[] args) {
        MainCard deckOfCard = new MainCard();
        deckOfCard.gameSetUp();
        deckOfCard.printDeck();
    }

    /**
     * initializing the deck of card
     */
    private void gameSetUp() {
        int i = 0;
        for (String s : deckOfCards[0]) {
            for (String value : deckOfCards[1]) {
                deck[i++] = new Card(s, value);
            }
        }
    }

    /**
     * printing the deck of card
     */
    private void printDeck() {
        for (Card card : deck) {
            System.out.println(card);
        }
    }
}
