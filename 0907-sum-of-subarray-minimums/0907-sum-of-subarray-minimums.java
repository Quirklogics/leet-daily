class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        long ans = 0;
       int[] st = new int[n];
       int u = -1;
        for(int i = 0; i <= n; i++){
            while(u != -1 && (i == n || arr[st[u]] > arr[i])){
                int mid = st[u--];
                int left = (u == -1) ? -1 : st[u];
                long sum = (long)(mid - left) * (i - mid);
                     ans = (ans + sum * arr[mid]) % 1000000007;
            }
            if(i < n){
                st[++u] = i;
            }
        }
        return (int) ans;
    }
}