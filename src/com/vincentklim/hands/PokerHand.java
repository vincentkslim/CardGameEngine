package com.vincentklim.hands;

/**
 * Abstract class that all other poker hands extend. This class only contains a classes ranking, which is an integer
 * representation of the hand's strength (e.g. Royal Flush is 1, Straight Flush is 2, etc..)
 *
 * @author Vincent Lim
 * @version July 31, 2018
 */
public abstract class PokerHand implements Comparable<PokerHand>{

    private int ranking;

    public PokerHand(int r) {
        ranking = r;
    }

    /**
     * Returns the ranking of this hand
     * @return      int representing this hand's strength
     */
    public int getRanking() { return ranking; }

    @Override
    public int compareTo(PokerHand o) {
        return ranking - o.ranking;
    }
}
