package com.vincentklim.hands;

/**
 * <description>
 *
 * @author Vincent Lim
 * @version August 02, 2018
 */
public class FullHouse extends PokerHand {

    private ThreeOfAKind triple;
    private Pair pair;

    public FullHouse(ThreeOfAKind t, Pair p) {
        super(4);
        triple = t;
        pair = p;
    }

    public ThreeOfAKind getTriple() { return triple; }
    public Pair getPair() { return pair; }

    /*
    @Override
    public String toString() {
        return "Full house " + triple.getRank() + " over " + pair.getRank();
    }*/

    @Override
    public String toString() {
        return "FullHouse{" +
                "triple=" + triple +
                ", pair=" + pair +
                '}';
    }
}

