1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int ptr=nums.length-1;
4     for(int i = 0; i<nums.length; i++) {
5     for(int j=i+1; j<nums.length;j++)
6 {
7            if(nums[i]+nums[j]==target)
8            {
9            return new int[]{i, j};
10     } 
11
12    }   
13      }
14     return new int[]{};
15    }
16}