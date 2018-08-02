package com.vincentklim.hands;

/**
 * <description>
 *
 * @author Vincent Lim
 * @version July 31, 2018
 */
public abstract class PokerHand {

    private int ranking;

    public PokerHand(int r) {
        ranking = r;
    }

    public int getRanking() { return ranking; }
}
