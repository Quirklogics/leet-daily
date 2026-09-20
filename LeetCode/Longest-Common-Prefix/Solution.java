1class Solution {
2    public String longestCommonPrefix(String[] strs) {
3        int minLen = strs[0].length();
4        for(String s : strs){
5          minLen = Math.min(minLen,s.length());
6        }
7        int i = 0;
8        while(i < minLen){
9            int j = 0;
10            while( j < strs.length-1){
11                if(strs[j].charAt(i) != strs[j+1].charAt(i)){
12                    return strs[0].substring(0,i);
13                }
14                j = j + 1;
15            }
16            i = i + 1;
17        }
18        return strs[0].substring(0,i);
19    }
20}