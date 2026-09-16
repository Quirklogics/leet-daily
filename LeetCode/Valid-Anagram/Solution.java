1class Solution {
2    public boolean isAnagram(String s, String t) {
3        Map <Character, Integer> map = new HashMap <>();
4        for(char c : s.toCharArray()){
5          map.put(c,map.getOrDefault(c,0)+1);
6        }
7         for(char c : t.toCharArray()){
8          map.put(c,map.getOrDefault(c,0)-1);
9        }
10        for(char c : map.keySet()){
11            if(map.get(c) != 0)
12            return false;
13        }
14        return true;
15    }
16}