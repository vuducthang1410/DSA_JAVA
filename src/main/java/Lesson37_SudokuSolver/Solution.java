package Lesson37_SudokuSolver;

public class Solution {
    private boolean isValid(char[][] board, int row, int col) {
        char val = board[row][col];

        for (int j = 0; j < 9; j++) {
            if (j != col && board[row][j] == val) return false;
        }

        for (int i = 0; i < 9; i++) {
            if (i != row && board[i][col] == val) return false;
        }

        int boxRow = (row / 3) * 3;
        int boxCol = (col / 3) * 3;
        for (int i = boxRow; i < boxRow + 3; i++) {
            for (int j = boxCol; j < boxCol + 3; j++) {
                if ((i != row || j != col) && board[i][j] == val) return false;
            }
        }
        return true;
    }


    public boolean backtracking(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] == '.') {
                    for (int k = 1; k <= 9; k++) {
                        board[i][j] = (char) (k + '0');
                        if (isValid(board, i, j) && backtracking(board)) {
                            return true;
                        }
                        board[i][j] = '.';
                    }
                    return false;
                }
            }
        }
        return true;
    }

    public void solveSudoku(char[][] board) {
        backtracking(board);
    }
}
