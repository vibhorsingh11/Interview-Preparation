package org.phoenix.interview.ctci.bitmanipulation;

/**
 * <p>
 * Given a positive integer, print the next smallest and the next largest number that have the same number
 * of 1 bits in their binary representation.
 */

public class NextNumber {
    private static int getNext(int n) {
        int zeroCount = 0;
        int oneCount = 0;
        int c = n;
        while ((c & 1) == 0 && c != 0) {
            zeroCount++;
            c >>= 1;
        }
        while ((c & 1) == 1) {
            oneCount++;
            c >>= 1;
        }
        int p = zeroCount + oneCount;
        if (p == 31 || p == 0) {
            return -1;
        }
        n |= (1 << p);
        n &= -(1 << p);
        n |= (1 << (oneCount - 1)) - 1;
        return n;
    }

    private static int getPrevious(int n) {
        int zeroCount = 0;
        int oneCount = 0;
        int c = n;
        while ((c & 1) == 1) {
            oneCount++;
            c >>= 1;
        }
        if (c == 0) {
            return -1;
        }
        while ((c & 1) == 0 && c != 0) {
            zeroCount++;
            c >>= 1;
        }
        int p = zeroCount + oneCount;
        n &= ((~0) << (p + 1));
        int mask = (1 << (oneCount + 1)) - 1;
        int mask2 = mask << (zeroCount - 1);
        n |= mask2;
        return n;
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(getNext(13948)));
        System.out.println(Integer.toBinaryString(getNext(12)));
        System.out.println(Integer.toBinaryString(getPrevious(13948)));
        System.out.println(Integer.toBinaryString(getPrevious(12)));
    }
}
