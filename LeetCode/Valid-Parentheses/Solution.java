1class Solution {
2    public boolean isValid(String s) {
3        Stack<Character> stack = new Stack<>();
4        for(char ch : s.toCharArray()){
5            if(ch == '(' || ch == '{' || ch == '['){
6                stack.push(ch);
7            }
8            else{
9                if(stack.isEmpty())return false;
10                if(ch == ')' && stack.pop() != '(') return false;
11                if(ch == '}' && stack.pop() != '{') return false;
12                if(ch == ']' && stack.pop() != '[') return false;
13            }
14        }
15        return stack.isEmpty();
16    }
17}