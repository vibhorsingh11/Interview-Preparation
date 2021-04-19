package org.phoenix.interview.ctci.arraysandstrings;

/**
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire row and
 * column are set to O.
 */

import java.util.Arrays;

public class ZeroMatrix {
    public static int[][] setMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0) {
            return matrix;
        }
        // length of row and column
        int m = matrix.length;
        int n = matrix[0].length;
        // array to store the index which needs to be updated
        boolean[] row = new boolean[m];
        boolean[] column = new boolean[n];
        // looping over the matrix and marking
        // indexes
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    column[i] = true;
                    break;
                }
            }
        }
        // Changing rows and columns to zero
        for (int i = 0; i < m; i++) {
            if (row[i]) {
                for (int j = 0; j < n; j++) {
                    matrix[i][j] = 0;
                }
            }
        }
        for (int j = 0; j < n; j++) {
            if (column[j]) {
                for (int i = 0; i < m; i++) {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{
                {0, 1, 2, 3, 4, 5},
                {0, 1, 2, 3, 4, 5},
                {0, 1, 2, 3, 4, 5},
                {0, 1, 2, 3, 4, 5},
                {0, 1, 2, 3, 4, 5},
                {0, 1, 2, 3, 4, 5}
        };
        System.out.println(Arrays.deepToString(setMatrix(matrix)));

        int[][] matrix1 = new int[][]{
                {2, 5, 3, 4},
                {4, 7, 1, 5},
                {3, 0, 5, 8}
        };
        System.out.println(Arrays.deepToString(setMatrix(matrix1)));
    }
}
