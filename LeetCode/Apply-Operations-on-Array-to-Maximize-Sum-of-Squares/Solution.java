1import java.util.List;
2
3class Solution {
4    private static final int MOD = 1_000_000_007;
5
6    public int maxSum(List<Integer> nums, int k) {
7        int[] bitCount = new int[31];
8
9        for (int x : nums) {
10            for (int b = 0; b < 31; b++) {
11                if (((x >> b) & 1) == 1) {
12                    bitCount[b]++;
13                }
14            }
15        }
16
17        long ans = 0;
18
19        for (int i = 0; i < k; i++) {
20            long val = 0;
21            for (int b = 0; b < 31; b++) {
22                if (bitCount[b] > i) {
23                    val |= (1L << b);
24                }
25            }
26            ans = (ans + val * val) % MOD;
27        }
28
29        return (int) ans;
30    }
31}