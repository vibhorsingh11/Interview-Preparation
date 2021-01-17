package org.phoenix.easy._02_Strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem05_ValidPalindromeTest {

    private final Problem05_ValidPalindrome test = new Problem05_ValidPalindrome();

    @Test
    void isPalindrome() {
        assertTrue(test.isPalindrome("A man, a plan, a canal: Panama"));
    }
}