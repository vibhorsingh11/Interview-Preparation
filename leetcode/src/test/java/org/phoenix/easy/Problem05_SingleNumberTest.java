package org.phoenix.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem05_SingleNumberTest {

    private final Problem05_SingleNumber test = new Problem05_SingleNumber();

    @Test
    void singleNumber() {
        int[] arr = new int[]{2, 2, 1};
        assertEquals(1, test.singleNumber(arr));
    }
}