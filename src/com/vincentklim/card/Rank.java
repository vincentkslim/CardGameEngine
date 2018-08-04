package com.vincentklim.card;

/**
 * Enum that represents all the possible ranks of a playing card from Ace to King. Each enum has an integer rank
 * (Ace=1, Two=2, ... Queen=12, King=13) that can be used for comparing card ranks.
 *
 * @author Vincent Lim
 * @version July 31, 2018
 */
public enum Rank {
    TWO (2),
    THREE (3),
    FOUR (4),
    FIVE (5),
    SIX (6),
    SEVEN (7),
    EIGHT (8),
    NINE (9),
    TEN (10),
    JACK (11),
    QUEEN (12),
    KING (13),
    ACE (1);

    private int rank;

    //constructor that sets the integer rank
    Rank(int r) {
        rank = r;
    }

    /**
     * Returns the integer representation of this rank
     * @return      integer that represents this rank
     */
    public int getRank() {
        return rank;
    }
}
