package org.phoenix.easy._01_Array;

import org.junit.jupiter.api.Test;
import org.phoenix.easy._01_Array.Problem10_ValidSudoku;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Problem10_ValidSudokuTest {

    private final Problem10_ValidSudoku test = new Problem10_ValidSudoku();

    @Test
    void isValidSudoku() {
        char[][] arr = new char[][]{{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};

        assertTrue(test.isValidSudoku(arr));
    }
}