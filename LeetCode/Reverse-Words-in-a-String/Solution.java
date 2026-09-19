1class Solution {
2    public String reverseWords(String s) {
3        int left = 0,
4        right = s.length()-1;
5        while(left < right && s.charAt(left) == ' ' ){
6                left++;
7        }
8        while(right > 0 && s.charAt(right) == ' ' ){
9            right--;
10        }
11        StringBuilder sB = new StringBuilder();
12        while(left <= right){
13            if(s.charAt(left) != ' '){
14                sB.append(s.charAt(left));
15            }
16            else if(sB.length() > 0 && sB.charAt(sB.length()-1) != ' '){
17                sB.append(s.charAt(left));
18            }
19            left++;
20        }
21        int i = 0,
22        j = sB.length() - 1;
23        while(i < j){
24            char temp = sB.charAt(i);
25            sB.setCharAt(i,sB.charAt(j));
26            sB.setCharAt(j,temp);
27            i++;
28            j--;
29        }
30        int start = 0,
31        end = 0;
32        while(start < sB.length()){
33            while(end < sB.length() && sB.charAt(end) != ' '){
34               end++;
35            }
36            i = start;
37            j = end-1;
38             while(i < j){
39            char temp = sB.charAt(i);
40            sB.setCharAt(i,sB.charAt(j));
41            sB.setCharAt(j,temp);
42            i++;
43            j--;
44        }
45        start = end + 1;
46        end = end + 1;
47
48        }
49        return sB.toString();
50    }
51}