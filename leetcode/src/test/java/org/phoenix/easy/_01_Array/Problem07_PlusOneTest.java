package org.phoenix.easy._01_Array;

import org.junit.jupiter.api.Test;
import org.phoenix.easy._01_Array.Problem07_PlusOne;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem07_PlusOneTest {

    private final Problem07_PlusOne test = new Problem07_PlusOne();

    @Test
    void plusOne() {
        int[] digits = new int[]{1, 2, 3};
        int[] result = new int[]{1, 2, 4};

        assertArrayEquals(result, test.plusOne(digits));
    }
}