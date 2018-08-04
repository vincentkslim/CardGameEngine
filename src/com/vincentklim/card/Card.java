package com.vincentklim.card;

/**
 * Represents a single card in a playing deck, with its suit and rank represented by an enum
 *
 * @author Vincent Lim
 * @version July 31, 2018
 */
public class Card implements Comparable<Card>{

    private Suit suit;
    private Rank rank;

    public Card(Suit s, Rank r) {
        suit = s;
        rank = r;
    }

    /**
     * Returns the suit of the card as an element from the enum Suit
     * @return      the suit of this card
     */
    public Suit getSuit() { return suit; }

    /**
     * Returns the rank of the card as an element from the enum Rank
     * @return      the rank of this card
     */
    public Rank getRank() { return rank; }

    @Override
    public int compareTo(Card o) {
        return rank.compareTo(o.rank);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Card card = (Card) o;
        return suit == card.suit && rank == card.rank;
    }
}

