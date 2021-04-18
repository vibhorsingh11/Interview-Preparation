package org.phoenix.interview.ctci.arraysandstrings;

/**
 * There are three types of edits that can be performed on strings: insert a character,
 * remove a character, or replace a character. Given two strings, write a function to check if they are
 * one edit (or zero edits) away.
 * EXAMPLE
 * pale, pIe -> true
 * pales. pale -> true
 * pale. bale -> true
 * pale. bake -> false
 */

public class OneAway {
    public static boolean away(String str1, String str2) {
        // if strings length is grater than 1
        if (str1.length() - str2.length() > 1) return false;
        int[] arr = new int[256];
        int i = 0;
        int j = 0;
        // increment the count for each char in case of
        // str1 and decrement for str2
        while (i < str1.length() && j < str2.length()) {
            arr[str1.charAt(i++)]++;
            arr[str2.charAt(j++)]--;
        }
        // looping for remaining chars
        while (i < str1.length()) {
            arr[str1.charAt(i++)]++;
        }
        while (j < str2.length()) {
            arr[str2.charAt(j++)]--;
        }
        int count = 0;
        // checking in array if more than 2
        // chars are different
        for (int value : arr) {
            if (value != 0) {
                count++;
                if (count > 2) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(away("pale", "ple"));
        System.out.println(away("pales", "pale"));
        System.out.println(away("pale", "bale"));
        System.out.println(away("pale", "bake"));
        System.out.println(away("pale", "be"));
    }
}
