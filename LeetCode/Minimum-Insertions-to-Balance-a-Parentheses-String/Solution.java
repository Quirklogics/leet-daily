1class Solution {
2    public int minInsertions(String s) {
3        int count = 0;
4        int close = 0;
5        for(int i = 0; i < s.length(); i++){
6             char c = s.charAt(i);
7             if(c == '(') count++;
8             else {
9             if(i + 1 < s.length() && s.charAt(i+1) == ')') i++;
10             else close++;
11             if(count > 0) count--;
12             else close++;  } 
13        }
14        return close + count*2;
15    }
16}