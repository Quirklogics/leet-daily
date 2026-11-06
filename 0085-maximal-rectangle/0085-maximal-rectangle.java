class Solution {
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int ans = 0;
        int[] stack = new int[n];
        int[] heights = new int[n];
        for(int i = 0; i < m; i++){
        for(int j = 0; j < n; j++){
            if(matrix[i][j] == '1') heights[j]++;
            else heights[j] = 0;
            }
            ans = Math.max(ans, area(heights,stack));
        }
        return ans;
    }
    public int area(int[] heights, int[] stack){
        int max = 0;
        int dif = -1;
        for(int i = 0; i <= heights.length; i++){
            int curr = (i == heights.length) ? 0 : heights[i];
            while(dif >= 0 && heights[stack[dif]] > curr){
                int height = heights[stack[dif--]];
                int weight;
                if(dif == -1) weight = i;
                else weight = i - stack[dif] - 1;

                max = Math.max(max, height*weight);
            }
            if(i < heights.length) stack[++dif] = i;
        }
        return max;
    }
}