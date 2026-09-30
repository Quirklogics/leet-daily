1class Solution {
2    public int isDigitSq(int n){
3        int sum = 0;
4        while(n != 0){
5            int digit = n % 10;
6            n /= 10;
7            sum += digit*digit;
8        }
9        return sum;
10    }
11    public boolean isHappy(int n) {
12        HashSet<Integer>set = new HashSet<>();
13        while(n != 1){
14            if(set.contains(n)){
15                return false;
16            }
17            set.add(n);
18            n = isDigitSq(n);
19        }
20        return true;
21    }
22}