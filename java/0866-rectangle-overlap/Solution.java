class Solution {
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int weigth = Math.min(rec1[2],rec2[2]) - Math.max(rec1[0],rec2[0]);
        int height = Math.min(rec2[3],rec1[3]) - Math.max(rec2[1],rec1[1]);
        return weigth > 0 && height > 0;
    }
}