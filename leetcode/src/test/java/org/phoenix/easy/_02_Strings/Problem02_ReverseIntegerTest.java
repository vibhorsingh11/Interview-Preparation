package org.phoenix.easy._02_Strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem02_ReverseIntegerTest {

    private final Problem02_ReverseInteger test = new Problem02_ReverseInteger();

    @Test
    void reverse() {
        assertEquals(321, test.reverse(123));
    }
}