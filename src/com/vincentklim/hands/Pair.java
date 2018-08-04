package com.vincentklim.hands;

import com.vincentklim.card.Card;
import com.vincentklim.card.Rank;

import java.util.Arrays;

/**
 * <description>
 *
 * @author Vincent Lim
 * @version August 02, 2018
 */
public class Pair extends PokerHand {
    private Rank rank;
    private Card[] kickers; //should be length 3

    public Pair(Rank r, Card[] k) {
        super(9);
        rank = r;
        kickers = k;
    }

    public Rank getRank() {
        return rank;
    }

    public Card[] getKickers() {
        return kickers;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "rank=" + rank +
                ", kickers=" + Arrays.toString(kickers) +
                '}';
    }
}

