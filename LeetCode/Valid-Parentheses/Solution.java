1class Solution {
2    public boolean isValid(String s) {
3        while(s.contains("()") || s.contains("{}") || s.contains("[]")){
4             s = s.replace("()","").replace("{}","").replace("[]","");
5        }
6        return s.isEmpty();
7    }
8}