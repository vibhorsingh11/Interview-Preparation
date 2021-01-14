package org.phoenix.easy._02_Strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem04_ValidAnagramTest {

    private final Problem04_ValidAnagram test = new Problem04_ValidAnagram();

    @Test
    void isAnagram() {
        assertTrue(test.isAnagram("anagram", "nagaram"));
    }
}