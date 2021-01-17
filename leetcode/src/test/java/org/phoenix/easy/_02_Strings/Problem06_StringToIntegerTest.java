package org.phoenix.easy._02_Strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem06_StringToIntegerTest {

    private final Problem06_StringToInteger test = new Problem06_StringToInteger();

    @Test
    void myAtoi() {
        assertEquals(42, test.myAtoi("42"));
    }
}