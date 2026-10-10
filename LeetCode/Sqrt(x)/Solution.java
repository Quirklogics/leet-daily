1class Solution {
2    public int mySqrt(int x) {
3        if(x == 0) return 0;
4        int left = 1;
5        int right = x;
6        while(left <= right){
7            int mid = left + (right - left)/2;
8            long sqr = (long) mid*mid;
9            if(sqr == x) return mid;
10            else if(sqr > x){
11                right = mid - 1;
12            } else{
13                left = mid + 1;
14            }
15        }
16        return right;
17    }
18}