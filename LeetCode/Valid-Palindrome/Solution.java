1class Solution {
2    private boolean isAlphaNumeric(char c){
3         if(c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9'){
4            return true;
5         }
6         return false;
7         }
8    public boolean isPalindrome(String s) {
9       int i = 0;
10       int j = s.length()-1;
11       while(i < j){
12        char c = s.charAt(i);
13        char ch = s.charAt(j);
14        if(! isAlphaNumeric(c)){
15            i = i + 1;
16            continue;
17        } if(! isAlphaNumeric(ch)){
18            j = j - 1;
19            continue;
20        }
21
22        if(Character.toLowerCase(c) != Character.toLowerCase(ch))
23        return false;
24
25        i = i + 1;
26        j = j - 1;
27       }
28       return true;
29    }
30}