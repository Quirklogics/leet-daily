1class Solution {
2    public int searchInsert(int[] nums, int target) {
3        int left = 0;
4        int right = nums.length - 1;
5        int ans = 0;
6        while(left <= right){
7            int mid = left + (right - left) / 2;
8            if(nums[mid] == target) return mid;
9            else if(nums[mid] > target){
10                right = mid - 1;
11            } else {
12                left = mid + 1;
13            }
14        }
15        return left;
16    }
17}