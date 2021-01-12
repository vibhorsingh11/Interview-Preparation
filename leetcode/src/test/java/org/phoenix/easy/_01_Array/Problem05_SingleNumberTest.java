package org.phoenix.easy._01_Array;

import org.junit.jupiter.api.Test;
import org.phoenix.easy._01_Array.Problem05_SingleNumber;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem05_SingleNumberTest {

    private final Problem05_SingleNumber test = new Problem05_SingleNumber();

    @Test
    void singleNumber() {
        int[] arr = new int[]{2, 2, 1};
        assertEquals(1, test.singleNumber(arr));
    }
}