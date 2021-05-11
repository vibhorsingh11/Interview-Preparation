package org.phoenix.goldmansachs;

/**
 * Given a string arr consisting of lowercase english letters, arrange all its letters in lexicographical order using Counting Sort.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 5
 * S = "edsab"
 * Output:
 * abdes
 * Explanation:
 * In lexicographical order, string will be
 * abdes.
 * Expected Time Complexity: O(N).
 * Expected Auxiliary Space: O(N).
 * <p>
 * Constraints:
 * 1 ≤ N ≤ 105
 */

public class CountingSort {
    public static String countSort(String arr) {
        // Array to store the count
        int[] countArr = new int[26];
        // Looping over string and adding count
        for (char c : arr.toCharArray()) {
            countArr[c - 'a']++;
        }
        // Storing the result count
        StringBuilder str
                = new StringBuilder();
        // Looping over array and appending the characters
        // to resultant string
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < countArr[i]; j++) {
                str.append((char) (i + 'a'));
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        System.out.println(countSort("edsab"));
        System.out.println(countSort("geeksforgeeks"));
    }
}
