1class Solution {
2    // public int isDigitSq(int n){
3    //     int sum = 0;
4    //     while(n != 0){
5    //         int digit = n % 10;
6    //         n /= 10;
7    //         sum += digit*digit;
8    //     }
9    //     return sum;
10    // }
11    // public boolean isHappy(int n) {
12    //     HashSet<Integer>set = new HashSet<>();
13    //     while(n != 1){
14    //         if(set.contains(n)){
15    //             return false;
16    //         }
17    //         set.add(n);
18    //         n = isDigitSq(n);
19    //     }
20    //     return true;
21    public int isDigitSq(int n){
22        int sum = 0;
23        while(n != 0){
24            int digit = n % 10;
25            n /= 10;
26            sum += digit*digit;
27        }
28        return sum;
29    }
30    public boolean isHappy(int n) {
31        int fast = n,
32        slow = n;
33        while(true){
34            slow = isDigitSq(slow);
35            fast = isDigitSq(isDigitSq(fast));
36            if(fast == 1){
37                return true;
38            }
39            if(slow == fast){
40                return false;
41            }
42        }
43    }
44}