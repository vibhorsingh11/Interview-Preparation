package org.phoenix.easy._01_Array;

import org.junit.jupiter.api.Test;
import org.phoenix.easy._01_Array.Problem08_MoveZeroes;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem08_MoveZeroesTest {

    private final Problem08_MoveZeroes test = new Problem08_MoveZeroes();

    @Test
    void moveZeroes() {
        int[] arr = new int[]{0, 1, 0, 3, 12};
        int[] result = new int[]{1, 3, 12, 0, 0};

        assertArrayEquals(result, test.moveZeroes(arr));
    }
}