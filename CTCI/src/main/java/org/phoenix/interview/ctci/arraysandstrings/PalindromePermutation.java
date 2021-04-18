package org.phoenix.interview.ctci.arraysandstrings;

/**
 * Given a string, write a function to check if it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is the same forwards and backwards. A permutation
 * is a rea rrangement of letters. The palindrome does not need to be limited to just dictionary words.
 * EXAMPLE
 * Input: Tact Coa
 * Output: True (permutations: "taco cat". "atco cta". etc.)
 */

public class PalindromePermutation {
    public static boolean permutation(String str) {
        // Change string to lowercase
        str = str.toLowerCase();
        // array to store elements
        int[] arr = new int[256];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                arr[str.charAt(i)]++;
            }
        }
        // count of char with occurrence more than 1
        int oddCount = 0;
        // looping over the frequency array
        for (int j : arr) {
            if (j % 2 == 1) {
                oddCount++;
                if (oddCount > 1) return false;
            }
        }
        return true;
    }

    // aabbaa, ccdbcc, ccbbbcc
    public static void main(String[] args) {
        System.out.println(permutation("Tact Coa"));
        System.out.println(permutation(" "));
        System.out.println(permutation("abaabcc"));
        System.out.println(permutation("abcb"));
    }
}
