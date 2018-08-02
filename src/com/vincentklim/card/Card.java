package com.vincentklim.card;

/**
 * <description>
 *
 * @author Vincent Lim
 * @version July 31, 2018
 */
public class Card {

    private Suit suit;
    private int rank;

    public Card(Suit s, int r) {
        suit = s;
        rank = r;
    }

    public Suit getSuit() { return suit; }
    public int getRank() { return rank; }
}

