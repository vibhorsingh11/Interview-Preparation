package org.phoenix.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem11_RotateImageTest {

    private final Problem11_RotateImage test = new Problem11_RotateImage();

    @Test
    void rotate() {
        int[][] arr = new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] result = new int[][]{{7, 4, 1}, {8, 5, 2}, {9, 6, 3}};
        assertArrayEquals(result, test.rotateImage(arr));
    }
}