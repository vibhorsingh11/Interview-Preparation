package org.phoenix.goldmansachs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Segregate0sAnd1sTest {

    private final Segregate0sAnd1s test = new Segregate0sAnd1s();

    @Test
    void segregate0and1() {
        int[] arr = new int[]{0, 0, 1, 1, 0};
        int[] expected = new int[]{0, 0, 0, 1, 1};
        assertArrayEquals(expected, test.segregate0and1(arr));
    }
}