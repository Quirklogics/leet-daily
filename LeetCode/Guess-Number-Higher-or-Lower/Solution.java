1/** 
2 * Forward declaration of guess API.
3 * @param  num   your guess
4 * @return 	     -1 if num is higher than the picked number
5 *			      1 if num is lower than the picked number
6 *               otherwise return 0
7 * int guess(int num);
8 */
9
10public class Solution extends GuessGame {
11    public int guessNumber(int n) {
12        int left = 1,
13        right = n;
14        while(left <= right){
15            int mid = left + (right - left)/2;
16            int num = guess(mid);
17            if(num == 0){
18                return mid;
19            } else if(num == -1){
20                right = mid - 1;
21            } else {
22                left = mid + 1;
23            }
24        }
25        return -1;
26    }
27}