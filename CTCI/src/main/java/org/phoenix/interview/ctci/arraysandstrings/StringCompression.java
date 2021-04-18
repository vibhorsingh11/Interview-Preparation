package org.phoenix.interview.ctci.arraysandstrings;

/**
 * Implement a method to perform basic string compression using the counts
 * of repeated characters. For example, the string aabcccccaaa would become a2b1c5a3. If the
 * "compressed" string would not become smaller than the original string, your method should return
 * the original string. You can assume the string has only uppercase and lowercase letters (a - z).
 */

public class StringCompression {
    public static String compression(String s) {
        // for new string
        StringBuilder str = new StringBuilder();
        int count = 1;
        // looping over the array
        for (int i = 0; i < s.length(); i++) {      // O(n)
            char c = s.charAt(i);
            while (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {      // same loop is working
                i++;
                count++;
            }
            // append the char and count
            str.append(c).append(count);
            count = 1;
        }
        return str.length() < s.length() ? str.toString() : s;
    }

    public static void main(String[] args) {
        System.out.println(compression("aabcccccaaa"));
        System.out.println(compression("WWWWWWWWWWWWBWWWWWWWWWWWWBBBWWWWWWWWWWWWWWWWWWWWWWWWBWWWWWWWWWWWWWW"));
    }
}
