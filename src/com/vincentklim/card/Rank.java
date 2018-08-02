package com.vincentklim.card;

/**
 * <description>
 *
 * @author Vincent Lim
 * @version July 31, 2018
 */
public enum Rank {
    ACE (1),
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
    KING (13);

    private int rank;

    Rank(int r) {
        rank = r;
    }

    public int getRank() {
        return rank;
    }
}
