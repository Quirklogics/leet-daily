1class Solution {
2    public int search(int[] nums, int target) {
3       int left = 0;
4       int right = nums.length-1;
5       while(left <= right){
6        int ans = left + (right - left)/2; // 0+6/2 -> 3
7        if(nums[ans] == target){
8            return ans;
9        } else if(nums[ans] < target){
10            left = ans+1;
11        } else{
12            right = ans-1;
13        }
14       }
15       return -1;
16    }
17}