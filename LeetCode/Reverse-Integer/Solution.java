1class Solution {
2    public int reverse(int x) {
3      int rev = 0;
4      while(x != 0)
5      {
6        int temp = x % 10;
7        x = x/10;
8        if(rev > Integer.MAX_VALUE/10 || rev == Integer.MAX_VALUE && temp > 7)
9        return 0;
10
11        if(rev < Integer.MIN_VALUE/10 || rev == Integer.MAX_VALUE && temp < -8)
12        return 0;
13
14        rev = rev * 10 + temp;
15      }
16      return rev;
17    }
18}