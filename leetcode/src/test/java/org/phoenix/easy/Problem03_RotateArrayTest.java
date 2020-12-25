package org.phoenix.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem03_RotateArrayTest {

    private final Problem03_RotateArray test = new Problem03_RotateArray();

    @Test
    void rotate() {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7};
        int[] expected = new int[]{5, 6, 7, 1, 2, 3, 4};
        assertArrayEquals(expected, test.rotate(arr, 3));
    }
}