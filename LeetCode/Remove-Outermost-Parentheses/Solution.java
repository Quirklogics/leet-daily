1class Solution {
2    public String removeOuterParentheses(String s) {
3        StringBuilder sB = new StringBuilder();
4        int count = 0;
5        for(char c : s.toCharArray()){
6            if(c == '('){
7                if(count != 0) sB.append(c);
8                count++;
9            } else{
10                count--;
11                 if(count != 0) sB.append(c);
12            }
13        }
14        return sB.toString();
15    }
16}