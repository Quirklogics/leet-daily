class Solution {
    public boolean canAliceWin(int n) {
        int stone = 10;
        int count = 0;
        while(n >= stone){
            n -= stone;
            stone--;
            count++;
        }
        return count % 2 == 1;
    }
}