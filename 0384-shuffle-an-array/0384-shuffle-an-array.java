class Solution {
    int[] init;
    Random r = new Random();
    public Solution(int[] nums) {
        init = nums.clone();
    }
    
    public int[] reset() {
        return init.clone();
    }
    
    public int[] shuffle() {
        int[] arr = init.clone();
        for(int i = arr.length - 1; i > 0; i--){
            int ran = r.nextInt(i + 1);
            int temp = arr[i];
            arr[i] = arr[ran];
            arr[ran] = temp;
        }
        return arr;
    }
}

/**
 * Your Solution object will be instantiated and called as such:
 * Solution obj = new Solution(nums);
 * int[] param_1 = obj.reset();
 * int[] param_2 = obj.shuffle();
 */