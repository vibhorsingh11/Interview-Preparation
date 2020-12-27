package org.phoenix.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Problem06_IntersectionOfTwoArraysIITest {

    private final Problem06_IntersectionOfTwoArraysII test = new Problem06_IntersectionOfTwoArraysII();

    @Test
    void intersect() {
        int[] arr1 = new int[]{1, 2, 2, 1};
        int[] arr2 = new int[]{2, 2};

        int[] result = new int[]{2, 2};
        assertArrayEquals(result, test.intersect(arr1, arr2));
    }
}