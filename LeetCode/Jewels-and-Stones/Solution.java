1class Solution {
2    public int numJewelsInStones(String jewels, String stones) {
3        Set<Character> set = new HashSet<>();
4        for(char c : jewels.toCharArray()){
5              set.add(c);
6        }
7        int count = 0;
8        for(int i = 0; i < stones.length(); i++){
9            char c = stones.charAt(i);
10            if(set.contains(c)) count++;
11        }
12        return count;
13    }
14}