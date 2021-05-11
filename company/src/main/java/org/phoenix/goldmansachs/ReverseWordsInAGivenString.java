package org.phoenix.goldmansachs;

/**
 * Given a String S, reverse the string without reversing its individual words. Words are separated by dots.
 * Constraints:
 * 1 <= |S| <= 2000
 */

public class ReverseWordsInAGivenString {
    private static String reverseWords(String S) {
        // Split string on dot
        String[] s = S.split("\\.");
        // Result string
        StringBuilder ans = new StringBuilder();
        // Looping over the array s
        for (int i = s.length - 1; i >= 0; i--) {
            ans.append(s[i]).append(".");
        }
        // Removing extra dot from the string
        return ans.substring(0, ans.length() - 1);
    }

    public static void main(String[] args) {
        String S = "i.like.this.program.very.much";
        System.out.println(reverseWords(S));
    }
}
