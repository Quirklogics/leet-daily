1class Solution {
2    public int[] maxDepthAfterSplit(String seq) {
3        int[] ans = new int[seq.length()];
4        int depth = 0;
5        for(int i = 0; i < seq.length(); i++){
6            ans[i] = (seq.charAt(i) == '(') ? ++depth % 2 : depth-- % 2;
7        }
8        return ans;
9    }
10}