class Solution {
    public int minCost(int[][] grid) {
        int r = grid.length;
        int c = grid[0].length;
        boolean[][][] dp = new boolean[r][c][1024];
        dp[0][0][grid[0][0]] = true;
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(i == 0 && j == 0) continue;
                int val = grid[i][j];
                for(int x = 0; x < 1024; x++){
                    if(i > 0 && dp[i -1][j][x] || j > 0 && dp[i][j -1][x]){
                     dp[i][j][x ^ val] = true;
                    }
                }
            }
        }
         for(int i = 0; i < 1024; i++){
         if(dp[r - 1][c - 1][i]) return i;
        }
      return -1;

    }
}