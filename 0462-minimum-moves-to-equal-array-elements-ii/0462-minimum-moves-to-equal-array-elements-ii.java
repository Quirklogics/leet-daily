class Solution {
    public int minMoves2(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        int mid = nums[n/2];
        int count = 0;
        for(int i = 0; i < n/2; i++){
            count += Math.abs(nums[i] - mid);
            count += Math.abs(nums[n - i - 1] - mid);
        }
        return count;
    }
}