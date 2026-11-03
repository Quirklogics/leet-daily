class Solution {
    public int minMoves(int[] nums) {
        int n = nums.length;
        int great = 0;
        int count = 0;
        int sum = 0;
       for(int i = 0; i < n; i++){
         sum += nums[i];
         great = nums[i] > great ? nums[i] : great;
       } 
       return (great * n) - sum;
    }
}