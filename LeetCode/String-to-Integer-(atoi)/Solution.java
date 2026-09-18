1class Solution {
2    public int myAtoi(String s) {
3      int i = 0;
4      int sign = 1;
5      int num = 0;
6    while(i < s.length() && s.charAt(i) == ' '){
7        i = i + 1;
8    }
9    if(i < s.length())
10    {  
11         if( s.charAt(i) == '-'){
12            sign = -1;
13         i++;
14    }
15    else if(s.charAt(i) == '+'){
16        i++;
17    }}
18
19         while(i < s.length() && isNumeric(s.charAt(i))){
20            int dig = s.charAt(i) - '0';
21            if(num == Integer.MAX_VALUE / 10){
22                if(sign == 1 &&  dig >= 7)
23                return Integer.MAX_VALUE;
24
25                if(sign == -1 && dig >= 8)
26                return Integer.MIN_VALUE;
27            }
28            if(num > Integer.MAX_VALUE / 10){
29            return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
30               }
31             num = num *10 + dig;
32               i++;
33         }
34         return (int)(sign*num);
35    }
36    private boolean isNumeric(char ch){
37         return ch >= '0' && ch <= '9';
38      }
39}