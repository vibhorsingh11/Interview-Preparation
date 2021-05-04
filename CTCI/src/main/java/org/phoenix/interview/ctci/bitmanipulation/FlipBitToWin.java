package org.phoenix.interview.ctci.bitmanipulation;

/**
 * You have an integer and you can flip exactly one bit from a 0 to a 1. Write code to
 * find the length of the longest sequence of 1 s you could create.
 * EXAMPLE
 * Input: 1775
 * Output: 8
 */

public class FlipBitToWin {
    public static int longestSequence(int n) {
        // If all bits are 1
        if (~n == 0) {
            return 8 * Integer.BYTES;
        }
        // Current and previous lengths of consecutive ones
        int previousLength = 0;
        int currentLength = 0;
        // Maximum length
        int maximumLength = Integer.MIN_VALUE;
        // Loop until n becomes zero
        while (n != 0) {
            // If current bit is 1 then increment current
            if ((n & 1) == 1) {
                currentLength++;
            } else if ((n & 1) == 0) {
                previousLength = (n & 2) == 0 ? 0 : currentLength;
                currentLength = 0;
            }
            maximumLength = Math.max(currentLength + previousLength + 1, maximumLength);
            n >>= 1;
        }
        return maximumLength;
    }

    public static void main(String[] args) {
        System.out.println(longestSequence(1775));
        System.out.println(longestSequence(31));
        System.out.println(longestSequence(255));
    }
}
