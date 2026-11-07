class Solution {
    public String decodeString(String s) {
        Stack<StringBuilder> sSt = new Stack <>();
        Stack<Integer> sInt = new Stack <>();
        StringBuilder s1 = new StringBuilder ();
        int count = 0;
        for(char ch : s.toCharArray()){
            if(Character.isDigit(ch)){
                count = count * 10 + (ch - '0');
            } else if(ch == '['){
                sSt.push(s1);
                sInt.push(count);
                s1 = new StringBuilder();
                count = 0;
            } else if(ch == ']'){
                StringBuilder s2 = sSt.pop();
                int n = sInt.pop();
                for(int i = 0; i < n; i++){
                    s2.append(s1);
                }
                s1 = s2;
            } else {
                s1 = s1.append(ch);
            }
        }
        return s1.toString();
    }
}