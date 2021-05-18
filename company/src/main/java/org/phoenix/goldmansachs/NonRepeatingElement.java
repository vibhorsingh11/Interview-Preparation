package org.phoenix.goldmansachs;

import java.util.HashMap;
import java.util.Map;

/**
 * Find the first non-repeating element in a given array arr of N integers.
 * Note: Array consists of only positive and negative integers and not zero.
 * Constraints:
 * 1 <= N <= 107
 * -1016 <= Ai <= 1016
 * {Ai !=0 }
 */

public class NonRepeatingElement {
    private static int firstNonRepeating(int[] arr) {
        // Map to store occurrence of elements
        Map<Integer, Integer> map = new HashMap<>();
        for (int ele : arr) {
            map.put(ele, map.getOrDefault(ele, 0) + 1);
        }
        // Checking all values
        for (int i = 0; i < 20; i++) {
            if (map.get(arr[i]) == 1) {
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = new int[]{-1, -17, -12, 8, 16, -17, -13, -14, -3, -6, -5, -11, -10, -12, -5, 19, -17, -5, -1, 12};
        System.out.println(firstNonRepeating(arr));
    }
}
