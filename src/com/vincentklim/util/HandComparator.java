package com.vincentklim.util;

import com.vincentklim.card.Card;
import com.vincentklim.hands.*;

import java.util.Comparator;

/**
 * Originally intended to be a Comparator class that could be used to sort a collection of PokerHands, but the
 * implementation has since been changed--Instead, the PokerHand abstract superclass now implements Comparable and each
 * subclass of PokerHand now implements its own compareTo method.
 *
 * @author Vincent Lim
 * @version July 31, 2018
 */
public class HandComparator implements Comparator<PokerHand> {

    public int compare(PokerHand o1, PokerHand o2) {
        int result;
        if ((result = o1.getRanking() - o2.getRanking()) != 0) return result;

        //There should never be more than two Royal Flushes on the board at the same time
        assert !(o1 instanceof RoyalFlush || o2 instanceof RoyalFlush);

        if (o1 instanceof StraightFlush && o2 instanceof StraightFlush)
            return compareStraightFlush((StraightFlush) o1, (StraightFlush) o2);
        else if (o1 instanceof FourOfAKind && o2 instanceof FourOfAKind)
            return compareFourOfAKind((FourOfAKind) o1, (FourOfAKind) o2);
        return 1;
    }

    private int compareStraightFlush(StraightFlush o1, StraightFlush o2) {
        Card[] sf1 = o1.getStraight().getCards();
        Card[] sf2 = o2.getStraight().getCards();
        return sf1[0].compareTo(sf2[0]);
    }

    private int compareFourOfAKind(FourOfAKind o1, FourOfAKind o2) {
        return o1.getRank() == o2.getRank() ? 0 : o1.getKicker().compareTo(o2.getKicker());
    }

    private int compareFullHouse(FullHouse o1, FullHouse o2) {
        return 0;
    }
}
