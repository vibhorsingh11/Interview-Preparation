package org.phoenix.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Problem01_RemoveDuplicatesFromSortedArrayTest {

    private final Problem01_RemoveDuplicatesFromSortedArray test = new Problem01_RemoveDuplicatesFromSortedArray();

    @Test
    void removeDuplicates() {
        int[] arr = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        assertEquals(5, test.removeDuplicates(arr));
    }
}