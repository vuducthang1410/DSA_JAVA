package Lesson36_ValidSudoku;

public class Solution {
    public boolean isValidLine(char[][] board, int index) {
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (board[i][index] == board[j][index] && board[i][index] != '.'
                        && board[j][index] != '.') {
                    return false;
                }
                if (board[index][i] == board[index][j] && board[index][i] != '.'
                        && board[index][j] != '.') {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isValidBox(char[][] board, int row, int col) {
        for (int i = row; i < row+3; i++) {
            for (int j = col; j < col+3; j++) {
                if (board[i][j] != '.'){
                    for (int x=row; x < row+3; x++) {
                        for (int y=col; y < col+3; y++) {
                            if(i!=x&&j!=y&&board[x][y]==board[i][j]){
                                return false;
                            }
                        }
                    }
                }
            }
        }
        return true;
    }

    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            if (!isValidLine(board, i)) return false;
            for (int j = 0; j < 9; j++) {
                if((j+3)%3==0&&(i+3)%3==0){
                    if (!isValidBox(board, i, j)) return false;
                }
            }
        }
        return true;
    }
}
