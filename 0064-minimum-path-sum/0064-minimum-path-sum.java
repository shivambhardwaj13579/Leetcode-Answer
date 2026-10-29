class Solution {
    public int minPathSum(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int[] dp = new int[col];
        dp[0] = grid[0][0];
        for (int j = 1; j < col; j++) {
            dp[j] = dp[j - 1] + grid[0][j];
        }
        for(int i = 1 ; i < row ; i++) {
            dp[0] += grid[i][0];
            for(int j = 1 ; j < col ; j++) {
                dp[j] = grid[i][j] + Math.min(dp[j], dp[j - 1]);
            }
        }
        return dp[col-1];
    }
}