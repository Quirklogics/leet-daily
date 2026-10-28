class Solution {
    int[] arr;
    int[] init;
    Random r = new Random();
    public Solution(int[] nums) {
        arr = nums;
        init = nums.clone(); 
    }
    
    public int[] reset() {
        arr = init;
        init = init.clone();
        return arr;
    }
    
    public int[] shuffle() {
        List<Integer> temp = new ArrayList<>();
        for(int n : arr){
          temp.add(n); 
        }

        for(int i = 0; i < arr.length; i++){
            int ranIdx = r.nextInt(temp.size());
            arr[i] = temp.get(ranIdx);
            temp.remove(ranIdx);
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