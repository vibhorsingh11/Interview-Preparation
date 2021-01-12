/*
 * Given an array of integers, find if the array contains any duplicates.
 * Your function should return true if any value appears at least twice in the array, and it should return false if
 * every element is distinct.
 *
 * Example 1:
 * Input: [1,2,3,1]
 * Output: true
 */

package org.phoenix.easy._01_Array;

import java.util.Arrays;

public class Problem04_ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }
}
