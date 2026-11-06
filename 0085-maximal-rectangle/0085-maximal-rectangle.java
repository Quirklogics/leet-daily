class Solution {
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int ans = 0;
        int[] heights = new int[n];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
               if(matrix[i][j] == '1')heights[j]++;
               else heights[j] = 0;
            }
            ans = Math.max(ans,area(heights));
        }
        return ans;
    }
    public int area(int[] heights){
        int max = 0;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i <= heights.length; i++){
            int curr = (i == heights.length) ? 0: heights[i];
            while(!st.isEmpty() && heights[st.peek()] > curr){
               int height = heights[st.pop()];
               int weight;
               if(st.isEmpty()){
                  weight = i;
               } else {
                  weight = i - st.peek() - 1;
               }
               max = Math.max(max, height*weight);
            }
            if(i < heights.length) st.push(i);
        }
        return max;
    }
}