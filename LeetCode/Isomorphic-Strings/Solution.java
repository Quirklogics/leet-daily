1class Solution {
2    public boolean isIsomorphic(String s, String t) {
3        int[] sVal = new int[128];
4        int[] tVal = new int[128];
5        for(int i = 0; i < s.length(); i++){
6            char cs = s.charAt(i);
7            char ct = t.charAt(i);
8            if(sVal[cs] != tVal[ct]){
9                return false;
10            }
11            sVal[cs] = i+1;
12            tVal[ct] = i+1;
13        }
14        return true;
15    }
16}