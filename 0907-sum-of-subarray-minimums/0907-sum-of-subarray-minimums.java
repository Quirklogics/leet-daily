class Solution {
    public int sumSubarrayMins(int[] arr) {
        int n = arr.length;
        long ans = 0;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i <= n; i++){
            while(!st.isEmpty() && (i == n || arr[st.peek()] > arr[i])){
                int mid = st.pop();
                int left = st.isEmpty() ? -1 : st.peek();
                long sum = (long)(mid - left) * (i - mid);
                     ans = (ans + sum * arr[mid]) % 1000000007;
            }
            if(i < n){
                st.push(i);
            }
        }
        return (int) ans;
    }
}