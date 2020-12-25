package org.phoenix.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem04_ContainsDuplicateTest {

    private final Problem04_ContainsDuplicate test = new Problem04_ContainsDuplicate();

    @Test
    void containsDuplicate() {
        int[] arr = new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertTrue(test.containsDuplicate(arr));
    }
}