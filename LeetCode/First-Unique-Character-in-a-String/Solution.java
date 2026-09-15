1class Solution {
2    public int firstUniqChar(String s) {
3       int freq[] = new int[26];
4       for(int i = 0; i < s.length(); i++){
5          freq[s.charAt(i)-'a']++;
6       }
7
8       for(int i = 0; i < s.length(); i++){
9         if(freq[s.charAt(i)-'a']==1) 
10         return i;
11       }
12      return -1;
13    }
14}