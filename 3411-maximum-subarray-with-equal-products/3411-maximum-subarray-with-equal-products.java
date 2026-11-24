class Solution {
    public int maxLength(int[] nums) {
        int n = nums.length;
        int ans = 0;
        for(int i = 0; i < n; i++){
            int prod = 1;
            int lcm = 1;
            int gcdVal = 0;
        for(int j = i; j < n; j++){
            prod *= nums[j];

            gcdVal = gcd(gcdVal, nums[j]);

            lcm = (lcm / gcd(lcm,nums[j])) * nums[j];
            
             if(prod == lcm * gcdVal){
                ans = Math.max(ans, j-i+1);
            }
            }
        }
        return ans;
    }
    public int gcd(int a, int b){
        while(b != 0){
            int temp = b;
            b = a%b;
            a = temp;
        }
        return a;
    }
}