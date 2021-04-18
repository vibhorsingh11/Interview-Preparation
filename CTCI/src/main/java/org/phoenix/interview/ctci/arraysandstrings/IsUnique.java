package org.phoenix.interview.ctci.arraysandstrings;

/**
 * Implement an algorithm to determine if a string has all unique characters. What if you
 * cannot use additional data structures?
 */

public class IsUnique {
    //Time O(n)
    //Space O(1)
    public static boolean check(String s) {
        // edge case
        if (s == null || s.equals("")) {
            return true;
        }
        // array to store elements
        int[] arr = new int[256];
        // looping over the array
        for (int i = 0; i < s.length(); i++) {
            if (arr[s.charAt(i)] != 0) {
                return false;
            }
            // increment the count by 1
            arr[s.charAt(i)]++;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(check("geeksforgeeks"));
        System.out.println(check(""));
    }
}
