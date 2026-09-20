1class Solution {
2    public int reverseDegree(String s) {
3             int sum = 0;
4        for(int i = 0 ; i < s.length(); i = i + 1){
5        int ch = s.charAt(i) - 'a' + 1;
6        int reverse = 27 - ch;
7        int position = i+1;
8        int product = reverse*position;
9        sum += product;
10        }
11       return sum;
12    }
13}