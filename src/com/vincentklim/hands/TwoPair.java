package com.vincentklim.hands;

import com.vincentklim.card.Card;

/**
 * <description>
 *
 * @author Vincent Lim
 * @version August 02, 2018
 */
public class TwoPair extends PokerHand {

    private Pair pair1, pair2;
    private Card kicker;

    public TwoPair(Pair p1, Pair p2, Card k) {
        super(8);
        pair1 = p1;
        pair2 = p2;
        kicker = k;
    }

    public Pair getPair1() {
        return pair1;
    }

    public Pair getPair2() {
        return pair2;
    }

    public Card getKicker() {
        return kicker;
    }

    /*
    @Override
    public String toString() {
        return "Two pair, " + pair1.getRank() + " and " + pair2.getRank();
    }*/

    @Override
    public String toString() {
        return "TwoPair{" +
                "pair1=" + pair1 +
                ", pair2=" + pair2 +
                ", kicker=" + kicker +
                '}';
    }
}

