package org.phoenix.goldmansachs;

/**
 * Find total number of Squares in a N*N cheesboard.
 * <p>
 * Example 1:
 * Input:
 * N = 1
 * Output:
 * 1
 * Explanation:
 * A 1*1 chessboard has only 1 square.
 * Example 2:
 * Input:
 * N = 2
 * Output:
 * 5
 * Explanation:
 * A 2*2 chessboard has 5 squares.
 * 4 1*1 squares and a 2*2 square.
 * <p>
 * Your Task:
 * You don't need to read input or print anything. Your task is to complete the function squaresInChessBoard() which takes an Integer N as input and returns the number of squares in a N*N chessboard.
 * Expected Time Complexity: O(1)
 * Expected Auxiliary Space: O(1)
 * Constraints:
 * 1 <= N <= 105
 */

public class SquaresInNNChessboard {
    private static Long squaresInChessBoard(Long N) {
        // variable to store sum
        long sum = 0L;
        // Loop until N is greater than 0
        while (N > 0) {
            sum += N * N;
            N--;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(squaresInChessBoard(1L));
        System.out.println(squaresInChessBoard(3L));
        System.out.println(squaresInChessBoard(8L));
    }
}
