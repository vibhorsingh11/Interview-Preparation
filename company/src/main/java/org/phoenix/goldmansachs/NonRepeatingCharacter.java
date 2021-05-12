package org.phoenix.goldmansachs;

/**
 * Given a string S consisting of lowercase Latin Letters. Find the first non-repeating character in S.
 * Constraints:
 * 1 <= N <= 103
 */

public class NonRepeatingCharacter {
    private static char nonrepeatingCharacter(String S) {
        //Array to store index
        int[] arr = new int[256];
        // Make all values -1
        for (int i = 0; i < 256; i++) {
            arr[i] = -1;
        }
        // Looping over the String and storing index value
        // in the index array. If the char is already traversed
        // then put -2 there
        for (int i = 0; i < S.length(); i++) {
            if (arr[S.charAt(i)] == -1) {
                arr[S.charAt(i)] = i;
            } else {
                arr[S.charAt(i)] = -2;
            }
        }
        int res = Integer.MAX_VALUE;
        // Checking all values of index array and
        // getting the lowest index
        for (int i = 0; i < 256; i++) {
            if (arr[i] >= 0)
                res = Math.min(res, arr[i]);
        }
        // Return the lowest index value
        return (res == Integer.MAX_VALUE) ? '$' : S.charAt(res);
    }

    public static void main(String[] args) {
        System.out.println(nonrepeatingCharacter("hello"));
        System.out.println(nonrepeatingCharacter("zxvczbtxyzvy"));
    }
}
