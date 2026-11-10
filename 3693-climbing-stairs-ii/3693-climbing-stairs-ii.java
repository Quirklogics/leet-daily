class Solution {
    public int climbStairs(int n, int[] costs) {
        int a = 0;
        int b = 0;
        int c = 0;
        for(int i = n-1; i >= 0; i--){
            int curr = a + costs[i] + 1;
            if(i + 2 <= n) curr = Math.min(curr, b + costs[i+1] + 4);
            if(i + 3 <= n) curr = Math.min(curr, c + costs[i+2] + 9);
           c = b;b = a; a = curr;
        }
        return a;
    }
}