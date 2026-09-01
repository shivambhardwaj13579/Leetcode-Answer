class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row = 0 ; row < 9 ; row++) {
            for(int col = 0 ; col < 9 ; col++) {
                if(board[row][col] != '.' && !isSafePlace(board, row, col)) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean isSafePlace(char[][] board , int row , int col) {
        char now = board[row][col];
        for(int i = 0 ; i < 9 ; i++) {
            if(row == i || col == i){
                continue;
            }
            if(board[i][col] == now) {
                return false;
            }
            if(board[row][i] == now) {
                return false;
            }
        }
        int sr = (row/3) * 3;
        int sc = (col/3) * 3;
        for(int r = sr; r < sr+3 ; r++ ) {
            for(int c = sc; c < sc+3 ; c++ ) {
                if((r != row && c != col) && board[r][c] == now) {
                    return false;
                }
            }
        }
        return true;
    }
}