package com.vincentklim.card;

/**
 * <description>
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

    public char getCode() { return code; }
}
