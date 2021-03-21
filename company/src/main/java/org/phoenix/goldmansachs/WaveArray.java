/**
 * Given a sorted array arr[] of distinct integers. Sort the array into a wave-like array and return it. In other words,
 * arrange the elements into a sequence such that a1 >= a2 <= a3 >= a4 <= a5..... (considering the increasing
 * lexicographical order).
 * <p>
 * Example 1:
 * <p>
 * Input:
 * n = 5
 * arr[] = {1,2,3,4,5}
 * Output: 2 1 4 3 5
 * Explanation: Array elements after
 * sorting it in wave form are
 * 2 1 4 3 5.
 * <p>
 * Constraints:
 * 1 ≤ n ≤ 106
 * 0 ≤ A[i] ≤107
 */
package org.phoenix.goldmansachs;

public class WaveArray {
    public int[] convertToWave(int[] arr) {
        // Looping over the array
        for (int i = 1; i < arr.length; i++) {
            // swapping the successive variables
            int temp = arr[i - 1];
            arr[i - 1] = arr[i];
            arr[i] = temp;
            i++;
        }
        return arr;
    }
}
