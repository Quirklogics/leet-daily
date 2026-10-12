1class Solution {
2    public int search(int[] nums, int target) {
3        int left = 0,
4            right = nums.length - 1;
5            while(left <= right){
6                int mid = left + (right - left) / 2 ;
7                if(nums[mid] == target){
8                    return mid;
9                } else if (nums[mid] <= nums[right]){
10                    if(nums[mid] < target && target <= nums[right]){
11                        left = mid + 1;
12                    } else{
13                        right = mid - 1;
14                    }
15                } else {
16                    if(nums[mid] > target && nums[left] <= target){
17                        right = mid -1;
18                    } else {
19                        left = mid + 1;
20                    }
21                }
22            }
23            return -1;
24    }
25}