package org.phoenix.easy._02_Strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem07_ImplementstrStrTest {

    private final Problem07_ImplementstrStr test = new Problem07_ImplementstrStr();

    @Test
    void strStr() {
        assertEquals(2, test.strStr("hello", "ll"));
    }
}