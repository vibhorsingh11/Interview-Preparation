package org.phoenix.easy._02_Strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem03_FirstUniqueCharacterInStringTest {

    private final Problem03_FirstUniqueCharacterInString test = new Problem03_FirstUniqueCharacterInString();

    @Test
    void firstUniqChar() {
        assertEquals(2, test.firstUniqChar("loveleetcode"));
    }
}