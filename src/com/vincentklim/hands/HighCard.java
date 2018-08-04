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
public class HighCard extends PokerHand {

    private Rank rank;
    private Card[] kickers;

    public HighCard(Rank r, Card[] k) {
        super(10);
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
        return "HighCard{" +
                "rank=" + rank +
                ", kickers=" + Arrays.toString(kickers) +
                '}';
    }
}

