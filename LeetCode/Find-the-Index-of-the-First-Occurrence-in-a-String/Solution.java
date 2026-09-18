1class Solution {
2    public int strStr(String haystack, String needle) {
3        if(needle.length() > haystack.length()) return -1;
4         for(int i = 0; i <= haystack.length() - needle.length(); i++){
5            int j = 0;
6            while(j < needle.length() && haystack.charAt(i+j) == needle.charAt(j)){
7                j++;
8            }
9            if(j == needle.length()) return i;
10        }
11        return -1;
12    }
13}