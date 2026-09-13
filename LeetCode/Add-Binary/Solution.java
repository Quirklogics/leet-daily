1class Solution {
2    public String addBinary(String a, String b) {
3        StringBuilder ans = new StringBuilder();
4        int i = a.length()-1,
5        j = b.length()-1;
6        int carry = 0;
7        while(i >= 0 || j >= 0 || carry > 0)
8        {
9            int sum = carry;
10            if(i >= 0){
11                sum += a.charAt(i) - '0';
12                i--;
13            }
14            if(j >= 0){
15                sum += b.charAt(j) - '0';
16                j--;
17            }
18            ans.append(sum%2);
19            carry = sum/2;
20        }
21        return ans.reverse().toString();
22    }
23}