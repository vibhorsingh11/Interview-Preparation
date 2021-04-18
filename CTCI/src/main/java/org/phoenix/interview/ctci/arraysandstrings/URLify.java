package org.phoenix.interview.ctci.arraysandstrings;

/**
 * Write a method to replace all spaces in a string with '%20: You may assume that the string
 * has sufficient space at the end to hold the additional characters, and that you are given the "true"
 * length of the string. (Note: If implementing in Java, please use a character array so that you can
 * perform this operation in place.)
 * EXAMPLE
 * Input: "Mr John Smith "J 13
 * Output: "Mr%20J ohn%20Smith"
 */

public class URLify {
    public static String url(char[] s) {
        int actualLength = s.length;
        int spaceCount = 0;
        // looping over string for space count
        for (char c : s) {
            if (c == ' ') {
                spaceCount++;
            }
        }
        while (s[actualLength - 1] == ' ') {
            spaceCount--;
            actualLength--;
        }
        int index = actualLength + spaceCount * 2;
        if (actualLength < s.length) {
            s[actualLength] = '\0';
        }
        // replacing space with required char
        for (int i = actualLength - 1; i >= 0; i--) {
            if (s[i] == ' ') {
                s[index - 1] = '0';
                s[index - 2] = '2';
                s[index - 3] = '%';
                index -= 3;
            } else {
                s[index - 1] = s[i];
                index--;
            }
        }
        return new String(s);
    }

    public static void main(String[] args) {
        String s = "Mr John Smith    ";
        System.out.println(url(s.toCharArray()));
    }
}
