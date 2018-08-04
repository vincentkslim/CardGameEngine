package com.vincentklim.hands;

import com.vincentklim.card.Card;
import com.vincentklim.card.Suit;

import java.util.Arrays;

/**
 * <description>
 *
 * @author Vincent Lim
 * @version August 02, 2018
 */
public class Flush extends PokerHand {

    private Suit suit;
    private Card[] cards;

    public Flush(Suit s, Card[] c) {
        super(5);
        suit = s;
        cards = c;
    }

    public Suit getSuit() { return suit; }
    public Card[] getCards() { return cards; }

    @Override
    public String toString() {
        return "Flush{" +
                "suit=" + suit +
                ", cards=" + Arrays.toString(cards) +
                '}';
    }
}

