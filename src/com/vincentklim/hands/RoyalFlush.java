package com.vincentklim.hands;

import com.vincentklim.card.Suit;

/**
 * Class that represents a royal flush
 *
 * @author Vincent Lim
 * @version July 31, 2018
 */
public class RoyalFlush extends PokerHand {

    private Flush flush;

    /**
     * Constructor that represents this hand's suit
     * @param f         the suit of this royal flush
     */
    public RoyalFlush(Flush f) {
        super(1);
        flush = f;
    }

    public Suit getSuit() { return flush.getSuit(); }


    /*
    /**
     * Returns a string representation of this hand
     * @return      A string that accurately depicts this hand

    @Override
    public String toString() { return "ROYAL FLUSH OF " + flush.getSuit(); }
    */

    /**
     * Returns a string representation of this hand
     *
     * @return A string that accurately depicts this hand
     */
    @Override
    public String toString() {
        return "RoyalFlush{" +
                "flush=" + flush +
                '}';
    }
}

