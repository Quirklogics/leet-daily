1class Solution {
2    public int smallestIndex(int[] nums) {
3        for(int i = 0; i < nums.length; i++){
4                int val = nums[i];
5                int sum = 0;
6                while(val > 0){
7                    int temp =  val % 10;
8                    sum += temp;
9                    val = val / 10;
10                }
11                if(sum == i) return i;
12        }
13        return -1;
14    }
15}