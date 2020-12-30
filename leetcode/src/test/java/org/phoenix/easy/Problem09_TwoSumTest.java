package org.phoenix.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem09_TwoSumTest {

    private final Problem09_TwoSum test = new Problem09_TwoSum();

    @Test
    void twoSum() {
        int[] arr = new int[]{2, 7, 11, 15};
        int[] result = new int[]{0, 1};

        assertArrayEquals(result, test.twoSum(arr, 9));
    }
}