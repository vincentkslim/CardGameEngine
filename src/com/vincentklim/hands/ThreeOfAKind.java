package com.vincentklim.hands;

import com.vincentklim.card.Card;
import com.vincentklim.card.Rank;

import java.util.Arrays;

/**
 * Class that represents a three of a kind
 *
 * @author Vincent Lim
 * @version August 02, 2018
 */
public class ThreeOfAKind extends PokerHand {

    private Rank rank;
    private Card[] kickers; //should be of length 2

    public ThreeOfAKind(Rank r, Card[] k) {
        super(7);
        rank = r;
        kickers = k;
    }

    public Rank getRank() { return rank; }

    public Card[] getKickers() { return kickers; }

    /*
    @Override
    public String toString() {
        return "Three " + rank;
    }*/

    @Override
    public String toString() {
        return "ThreeOfAKind{" +
                "rank=" + rank +
                ", kickers=" + Arrays.toString(kickers) +
                '}';
    }
}

