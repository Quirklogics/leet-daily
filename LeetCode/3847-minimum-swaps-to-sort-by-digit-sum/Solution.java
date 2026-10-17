class Solution {
    public int sumD(int n){
        int sum = 0;
        while(n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public int orgOrSum(int n1,int n2){
        int a = sumD(n1);
        int b = sumD(n2);
        if(a != b) return Integer.compare(a,b);
        return Integer.compare(n1,n2);
    }
    public int minSwaps(int[] nums) {
        int n = nums.length;
        Integer[] sort = new Integer[n];
        for(int i = 0; i < n; i++){
            sort[i] = nums[i];
        }
        Arrays.sort(sort, this::orgOrSum);
        Map<Integer,Integer> map = new HashMap <>();
         for(int i = 0; i < n; i++){
           map.put(nums[i],i);
        }
        int count = 0;
         for(int i = 0; i < n; i++){
            int pos = sort[i];
            int curr = nums[i];
            if(pos == curr) continue;
            int idx = map.get(pos);
            nums[i] = pos;
            nums[idx] = curr;
            map.put(pos, i);
            map.put(curr, idx);
            count++;
        }
        return count;
    }
}