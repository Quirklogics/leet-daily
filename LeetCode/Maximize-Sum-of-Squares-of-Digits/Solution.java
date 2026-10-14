1class Solution {
2    public String maxSumOfSquares(int num, int sum) {
3        if(sum > num * 9) return "";
4        StringBuilder sB = new StringBuilder ();
5        for(int i = 0; i < num; i ++){
6            if(sum >= 9){
7             sB.append(9);
8             sum -= 9;
9            } else {
10                sB.append(sum);
11                sum = 0;
12            }
13        }
14        return sB.toString();
15    }
16}