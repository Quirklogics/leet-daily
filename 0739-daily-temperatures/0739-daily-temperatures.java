class Solution {
    public int[] dailyTemperatures(int[] temp) {
        int[] days = new int[temp.length];
        int warm = 1;
        for(int i = temp.length - 1; i >= 0; i--){
            int curr = temp[i];
            if(curr >= warm){
                warm = curr;
                continue;
            }
            int count = 1;
            while(true){
                if(temp[i + count] > curr){
                    days[i] = count;
                    break;
                } else {
                    count = count + days[i + count];
                }
            }
        }
       return days;
    }
}