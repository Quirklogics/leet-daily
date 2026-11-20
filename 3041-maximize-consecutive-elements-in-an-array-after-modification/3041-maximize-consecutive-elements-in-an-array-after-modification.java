class Solution {
    public int maxSelectedElements(int[] nums) {
        Arrays.sort(nums);
        int ans = 0;
        HashMap<Integer, Integer> dp = new HashMap<>();
        for(int x : nums){
            dp.put(x+1, dp.getOrDefault(x,0)+1);
            dp.put(x, dp.getOrDefault(x-1,0)+1); 
            ans = Math.max(ans,Math.max(dp.get(x+1),dp.get(x)));
        }
        return ans;
    }
}