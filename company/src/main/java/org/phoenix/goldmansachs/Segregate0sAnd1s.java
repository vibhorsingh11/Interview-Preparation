/**
 * Given an array of length N consisting of only 0s and 1s in random order. Modify the array to segregate 0s on left
 * side and 1s on the right side of the array.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * N = 5
 * arr[] = {0, 0, 1, 1, 0}
 * Output: 0 0 0 1 1
 * Constraints:
 * 1 ≤ N ≤ 107
 * 0 ≤ arri ≤ 1
 */
package org.phoenix.goldmansachs;

public class Segregate0sAnd1s {
    public int[] segregate0and1(int[] arr) {
        // Setting variable
        int left = 0;
        int right = arr.length - 1;
        // looping until left side is smaller than right
        while (left < right) {
            // If left value is 0 then increment
            while (arr[left] == 0 && left < right)
                left++;
            // If right value is 0 then increment
            while (arr[right] == 1 && left < right)
                right--;
            // Swap the values
            if (left < right) {
                arr[left] = 0;
                arr[right] = 1;
                left++;
                right--;
            }
        }
        return arr;
    }
}
