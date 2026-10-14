1class Solution {
2    public String maxSumOfSquares(int num, int sum) {
3        if(sum > num * 9) return "";
4        int count = sum / 9;
5        sum %= 9;
6        StringBuilder ans = new StringBuilder("9".repeat(count));
7        if(sum > 0){
8            ans.append(sum);
9        }
10        ans.append("0".repeat(num - ans.length()));
11        return ans.toString();
12    }
13}