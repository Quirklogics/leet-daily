class Solution {
    long mod = 1_000_000_007;
    public long power(long base, long p){
        if(p == 0) return 1;
        long half = power(base,p/2);
        long ans = (half * half)%mod;
        if(p % 2 == 1){
            ans = (ans * base) % mod;
        }
        return ans;
    }
    public boolean check(int[] nums, int k, int base){
        int n = nums.length;
        long p = power(base % mod,k -1);
        long hash = 0;
        Map<Long,Integer>mp = new HashMap<>();
        int i = 0, j = 0;
        while(j < n){
          hash = (hash * base + nums[j])%mod;
          if(j - i + 1 < k){
            j++;
          }else{
            mp.put(hash,mp.getOrDefault(hash,0)+1);
            hash = (hash - (p * nums[i])% mod + mod) % mod;
            i++;
            j++;
          }
        }
        for(int c : mp.values()){
            if(c == 1)return true;
         }
        return false;
    }
    public int smallestUniqueSubarray(int[] nums) {
        int n = nums.length;
        int base = Arrays.stream(nums).max().getAsInt()+1;
        int l = 1;
        int r = n;
        int ans = n;
        while(l <= r){
            int mid = l + (r - l) / 2;
            if(check(nums, mid, base)){
                ans = mid;
                r = mid -1;
            }else{
                l = mid +1;
            }
        }
        return ans;
    }
}