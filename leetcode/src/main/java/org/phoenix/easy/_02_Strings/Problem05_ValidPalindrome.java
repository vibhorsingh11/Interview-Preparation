/*
 * Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
 * Note: For the purpose of this problem, we define empty string as valid palindrome.
 *
 * Example 1:
 * Input: "A man, a plan, a canal: Panama"
 * Output: true
 *
 * Example 2:
 * Input: "race a car"
 * Output: false
 *
 * Constraints:
 * s consists only of printable ASCII characters.
 */
package org.phoenix.easy._02_Strings;

public class Problem05_ValidPalindrome {
    public boolean isPalindrome(String s) {
        char[] charArray = s.toCharArray();
        int start = 0, end = s.length() - 1;
        while (start < end) {
            if (validChar(charArray[start])) {
                start++;
                continue;
            }
            if (validChar(charArray[end])) {
                end--;
                continue;
            }
            if (Character.toLowerCase(charArray[start]) != Character.toLowerCase(charArray[end])) {
                return false;
            } else {
                start++;
                end--;
            }
        }
        return true;
    }

    private boolean validChar(char c) {
        return (c < 'a' || c > 'z') && (c < 'A' || c > 'Z') && (c < '0' || c > '9');
    }
}
