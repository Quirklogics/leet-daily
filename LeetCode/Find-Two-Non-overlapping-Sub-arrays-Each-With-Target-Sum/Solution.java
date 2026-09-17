1class Solution {
2    public int minSumOfLengths(int[] arr, int target) {
3       int i = 0, j = 0, n = arr.length;
4       int sum = 0, minTillIdx = Integer.MAX_VALUE, result = Integer.MAX_VALUE;
5       int ans[] = new int[n];
6       while(i < n){
7        sum += arr[i];
8        while(j < i && sum > target){
9            sum -= arr[j++];
10        }
11        if(sum == target){
12            int len = i - j + 1;
13            if(j > 0 && ans[j-1] != Integer.MAX_VALUE){
14                result =  Math.min(result, len+ans[j-1]);
15            }
16            minTillIdx =  Math.min(minTillIdx , len);
17        }
18        ans[i++] = minTillIdx;
19       }
20       return result == Integer.MAX_VALUE ? -1 : result;
21    }
22}