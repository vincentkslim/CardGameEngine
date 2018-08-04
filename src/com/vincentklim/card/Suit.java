package com.vincentklim.card;

/**
 * Enum that represents the four possible suits of a playing card
 *
 * @author Vincent Lim
 * @version July 31, 2018
 */
public enum Suit {
    CLUBS ('C'),
    DIAMONDS ('D'),
    HEARTS ('H'),
    SPADES ('S');

    private final char code;

    Suit(char c) {
        code = c;
    }

    /**
     * Returns a single uppercase character that represents this suit
     * @return      a single character that represents this suit
     */
    public char getCode() { return code; }
}
