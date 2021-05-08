package org.phoenix.goldmansachs;

/**
 * Given a matrix of size n x m, where every row and column is sorted in increasing order, and a number x. Find whether element x is present in the matrix or not.
 * <p>
 * Example 1:
 * <p>
 * Input:
 * n = 3, m = 3, x = 62
 * matrix[][] = {{ 3, 30, 38},
 * {36, 43, 60},
 * {40, 51, 69}}
 * Output: 0
 * Explanation:
 * 62 is not present in the matrix,
 * so output is 0.
 * Constraints:
 * 1 <= N, M <= 1000
 * 1 <= mat[][] <= 105
 * 1 <= X <= 1000
 */

public class SearchInARowColumnSortedMatrix {
    private static boolean search(int[][] matrix, int n, int m, int x) {
        // Base case
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        // Variables to store matrix index
        int i = 0;
        int j = m - 1;
        // looping over matrix
        while (i < n && j >= 0) {
            // If target found the return true
            if (matrix[i][j] == x) {
                return true;
            } else if (matrix[i][j] < x) {
                i++;
            } else {
                j--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{3, 30, 38},
                {36, 43, 60},
                {40, 51, 69}};
        System.out.println(search(matrix, matrix.length, matrix[0].length, 62));

        int[][] matrix1 = new int[][]{{18, 21, 27, 38, 55, 67}};
        System.out.println(search(matrix1, 1, 6, 55));
    }
}
