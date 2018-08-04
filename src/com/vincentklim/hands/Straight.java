package com.vincentklim.hands;

import com.vincentklim.card.Card;

import java.util.Arrays;

/**
 * Class that represents a straight
 *
 * @author Vincent Lim
 * @version August 02, 2018
 */
public class Straight extends PokerHand {

    private Card[] cards;

    public Straight(Card[] c){
        super(6);
        cards = c;
    }

    public Card[] getCards() {
        return cards;
    }

    @Override
    public String toString() {
        return "Straight{" +
                "cards=" + Arrays.toString(cards) +
                '}';
    }
}

