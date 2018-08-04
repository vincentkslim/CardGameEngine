package com.vincentklim.hands;

import com.vincentklim.card.Card;
import com.vincentklim.card.Rank;

/**
 * Class that represents a Four of a kind. Houses both the rank and a kicker card to break ties.
 *
 * @author Vincent Lim
 * @version July 31, 2018
 */
public class FourOfAKind extends PokerHand {

    //The kicker is used to break ties
    private Rank rank;
    private Card kicker;

    public FourOfAKind(Rank r, Card k) {
        super(3);
        rank = r;
        kicker = k;
    }

    public Rank getRank() { return rank; }

    public Card getKicker() { return kicker; }

    /*
    @Override
    public String toString() {
        return "Four " + rank + "s!";
    }*/

    @Override
    public String toString() {
        return "FourOfAKind{" +
                "rank=" + rank +
                ", kicker=" + kicker +
                '}';
    }

    @Override
    public int compareTo(PokerHand o) {
        int result = super.compareTo(o);
        if (result != 0) return result;

        //if ((result = ))
        return 1;
    }
}

