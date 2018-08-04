package com.vincentklim.hands;

import com.vincentklim.card.Suit;

/**
 * Class that represents a Straight Flush.
 *
 * @author Vincent Lim
 * @version July 31, 2018
 */
public class StraightFlush extends PokerHand {

    private Flush flush;
    private Straight straight;

    public StraightFlush(Flush f, Straight s) {
        super(2);
        flush = f;
        straight = s;
    }

    public Suit getSuit() { return flush.getSuit(); }

    public Straight getStraight() { return straight; }

    /*
    @Override
    public String toString() {
        return straight.getCards()[0].getRank() + " to " + straight.getCards()[4].getRank() + " Straight Flush of " + flush.getSuit();
    }*/

    @Override
    public String toString() {
        return "StraightFlush{" +
                "flush=" + flush +
                ", straight=" + straight +
                '}';
    }
}

