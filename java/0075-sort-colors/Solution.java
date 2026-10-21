class Solution {
    public void sortColors(int[] nums) {
        int min = 0;
        for(int i = 0; i  < nums.length; i++){
            min = i;
            for( int j = i + 1; j < nums.length; j++){
                if(nums[j] < nums[min]){
                    min = j;
                }
            }
            int temp = nums[min];
                nums[min] = nums[i];
                nums[i] = temp;
        }
    }
}