1class Solution {
2    public long maxAlternatingSum(int[] nums) {
3        int n = nums.length;
4        long[] square = new long[n];
5        for(int i = 0; i < n; i++){
6            square[i] = (long) nums[i] * nums[i];
7        }
8        Arrays.sort(square);
9        long ans = 0;
10       for(int i = 0; i < n/2; i++){
11        ans -= square[i];
12       }  for(int i = n/2; i < n; i++){
13        ans += square[i];
14       }
15    return ans;
16    }
17}