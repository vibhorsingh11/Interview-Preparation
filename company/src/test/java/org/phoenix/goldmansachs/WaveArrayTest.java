package org.phoenix.goldmansachs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class WaveArrayTest {

    private final WaveArray test = new WaveArray();

    @Test
    void convertToWave() {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        int[] res = new int[]{2, 1, 4, 3, 5};
        assertArrayEquals(res, test.convertToWave(arr));
    }
}