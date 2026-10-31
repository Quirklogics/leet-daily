class Solution {
    public int uniquePaths(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int mod = 1_000_000_007;
        long[][][] dp = new long[m][n][2];
        for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            long left = dp[i][j][0];
            long top = dp[i][j][1];
        if(i == 0 && j == 0){
            left = 1;
        }
        if(grid[i][j] == 1){
            if(i + 1 < m){
                dp[i+1][j][1] = (dp[i+1][j][1] + left) % mod;
            }  if(j + 1 < n){
                dp[i][j+1][0] = (dp[i][j + 1][0] + top) % mod;
            } } else {
                long ways = (left + top) % mod;
                 if(i + 1 < m){
                dp[i+1][j][1] = (dp[i+1][j][1] + ways) % mod;
            }  if(j + 1 < n){
                dp[i][j+1][0] = (dp[i][j + 1][0] + ways) % mod;
            }}}}
        return (int) ((dp[m - 1][n - 1][0] + dp[m - 1][n - 1][1]) % mod);
    }
}