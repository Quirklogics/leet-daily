class Solution {
    public int evalRPN(String[] tokens) {
        String exp = "+-/*";
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i < tokens.length;i++){
            String token = tokens[i];
            if(exp.contains(token)){
              int b = stack.pop();
              int a = stack.pop();
              int val = 0;
              switch(token){
                case "+" : val = a+b;
                break;
                case "-" : val = a-b;
                break;
                case "*" : val = a*b;
                break;
                case "/" : val = a/b;
                break;}
                stack.push(val);
            } else {
                stack.push(Integer.parseInt(token));
            }
        }
        return stack.peek();
    }
}