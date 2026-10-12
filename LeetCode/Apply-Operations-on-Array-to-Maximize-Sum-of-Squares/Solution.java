1class Solution {
2    public int maxSum(List<Integer> nums, int k) {
3        int limt = 1_000_000_007;
4        int bit = 30;
5        int[] freq = new int[bit];
6        for(int n : nums){
7            for(int i = 0; i < bit; i++){
8                if((n & (1 << i)) != 0){
9                    freq[i]++;
10                }
11            }
12        }
13        long ans = 0;
14        while(k-- > 0){
15            long temp = 0;
16          for(int i = 0; i < bit; i++){
17            if(freq[i] > 0){
18                freq[i]--;
19                temp |= (1L << i);
20            }
21          }
22          ans = (ans+temp*temp)%limt;
23        }
24        return (int)ans;
25    }
26}