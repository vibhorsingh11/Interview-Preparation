package org.phoenix.goldmansachs;

import java.util.HashMap;
import java.util.Map;

/**
 * Given two arrays A and B of equal size N, the task is to find if given arrays are equal or not. Two arrays are said
 * to be equal if both of them contain same set of elements, arrangements (or permutation) of elements may be different
 * though.
 * Note : If there are repetitions, then counts of repeated elements must also be same for two array to be equal.
 * Constraints:
 * 1<=N<=107
 * 1<=A[],B[]<=1018
 */

public class CheckIfTwoArraysAreEqualOrNot {
    public static boolean check(long[] A, long[] B, int N) {
        // Hashmap to store first array elements
        Map<Long, Integer> map = new HashMap<>();
        // Looping over A and adding in map
        for (long a : A) {
            map.put(a, map.getOrDefault(a, 0) + 1);
        }
        // Checking array B elements in A
        for (long b : B) {
            if (!map.containsKey(b)) {
                return false;
            }
            if (map.get(b) == 0) {
                return false;
            }
            int value = map.get(b);
            map.put(b, value - 1);
        }
        return true;
    }

    public static void main(String[] args) {
        long[] A = new long[]{1L, 2L, 5L, 4L, 0L};
        long[] B = new long[]{2L, 4L, 5L, 0L, 1L};
        System.out.println(check(A, B, 5));
    }
}
