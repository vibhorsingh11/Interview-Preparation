package org.phoenix.easy._02_Strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem01_ReverseStringTest {

    private final Problem01_ReverseString test = new Problem01_ReverseString();

    @Test
    void reverseString() {
        char[] arr = new char[]{'h', 'e', 'l', 'l', 'o'};
        char[] result = new char[]{'o', 'l', 'l', 'e', 'h'};
        assertArrayEquals(result, test.reverseString(arr));
    }
}