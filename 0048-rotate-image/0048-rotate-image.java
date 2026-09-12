class Solution {
    public void rotate(int[][] matrix) {
        int row = matrix[0].length;
        int column = matrix.length;
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column ; j++){
                if(i > j){
                    int temp = matrix[i][j];
                    matrix[i][j] = matrix[j][i];
                    matrix[j][i] = temp;
                }
            }
        }
        int s = 0;
        for(int i = 0 ; i < row ; i++){
            for(int j = 0 ; j < column/2 ; j++){
                s = (column - j) - 1;
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][s];
                matrix[i][s] = temp;
            }
        }
    }
}