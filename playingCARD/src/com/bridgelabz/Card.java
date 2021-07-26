package com.bridgelabz;

public class Card {
    String suits;
    String rank;

    //creating a parameterized constructor
    public Card(String suits, String rank) {
        this.suits = suits;
        this.rank = rank;
    }

    /*
    * Create getter and setter
    * description: The get method returns the variable value, and the set method sets the value.
    */

    public String getSuits() {
        return suits;
    }

    public void setSuits(String suits) {
        this.suits = suits;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Card [suit=" + suits + ", rank=" + rank + "]";
    }
}
