1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3       for(int j=0;j<nums.length;j++)
4       {
5        for(int i=j+1;i<nums.length;i++)
6        {
7            if(nums[j]+nums[i]==target)
8            {
9                return new int[]{j,i};
10            }
11        }
12       }
13      return new int[]{};
14    }
15}