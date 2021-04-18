package org.phoenix.interview.ctci.arraysandstrings;

/**
 * Given two strings, write a method to decide if one is a permutation of the
 * other.
 */
public class CheckPermutation {
    public static boolean isPermutation(String a, String b) {
        if (a.length() != b.length()) return false;
        // Array to store string elements
        int[] arr = new int[256];
        // looping over the first string
        for (int i = 0; i < a.length(); i++) {
            arr[a.charAt(i)]++;
            arr[b.charAt(i)]--;
        }
        for (int j : arr) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }

    // driver code
    public static void main(String[] args) {
        System.out.println(isPermutation("abc", "def"));
        System.out.println(isPermutation("abc", "de"));
        System.out.println(isPermutation("act", "cat"));
        System.out.println(isPermutation("", ""));
    }
}
