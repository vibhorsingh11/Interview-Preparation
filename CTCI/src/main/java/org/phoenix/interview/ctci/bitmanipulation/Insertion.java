package org.phoenix.interview.ctci.bitmanipulation;

/**
 * You are given two 32-bit numbers, Nand M, and two bit positions, i and
 * j. Write a method to insert Minto N such that M starts at bit j and ends at bit i. You
 * can assume that the bits j through i have enough space to fit all of M. That is, if
 * M = 10011, you can assume that there are at least 5 bits between j and i. You would not, for
 * example, have j = 3 and i = 2, because M could not fully fit between bit 3 and bit 2.
 * EXAMPLE
 * Input: N 10011, i 2, j 6
 * Output: N 10001001100
 */

public class Insertion {

    private static int insertion(int N, int M, int i, int j) {
        // Creating a mask to clear bits from i to j
        int one = ~0;
        // Shifting bits j + 1
        int left = one << (j + 1);
        // 1's after i
        int right = (1 << i) - 1;
        // 0 from i though j
        int mask = left | right;
        // Clear bits and shift M to i position
        int nCleared = N & mask;
        int mShifted = M << i;
        return nCleared | mShifted;
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(insertion(1024, 19, 2, 6)));
    }
}
