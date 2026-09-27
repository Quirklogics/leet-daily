1class Solution {
2    public String reverseParentheses(String s) {
3        Stack <String> stack = new Stack <> ();
4        String curr = "";
5        for(char ch : s.toCharArray()){
6            if(ch == '('){
7                stack.push(curr);
8                curr = "";
9            } else if(ch == ')'){
10                curr = new StringBuilder(curr).reverse().toString();
11                String prev = stack.pop();
12                curr = prev + curr;
13            }
14            else{
15             curr = curr + ch;
16            }
17        }
18        return curr;
19    }
20}