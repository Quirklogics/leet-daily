1class Solution {
2    public int[] maxDepthAfterSplit(String seq) {
3        int[] ans = new int[seq.length()];
4        int depth = 0;
5        int i = 0;
6        for(char ch : seq.toCharArray()){
7            ans[i] = (ch == '(') ? ++depth % 2 : depth-- % 2;
8            i++;
9        }
10        return ans;
11    }
12}