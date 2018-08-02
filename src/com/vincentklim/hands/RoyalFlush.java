package com.vincentklim.hands;

import com.vincentklim.card.Suit;

/**
 * <description>
 *
 * @author Vincent Lim
 * @version July 31, 2018
 */
public class RoyalFlush extends PokerHand {

    private Suit suit;

    public RoyalFlush(Suit s) {
        super(1);
        suit = s;
    }

    public String toString() { return "ROYAL FLUSH OF " + suit; }

}

