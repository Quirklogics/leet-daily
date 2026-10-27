class Solution {
    public String[] createGrid(int m, int n) {
        String topRow = ".".repeat(n);
        String rem = "#".repeat(n-1)+".";
        String[] r1 = new String[m];
        r1[0] = topRow;
        for(int i = 1; i < m; i++){
            r1[i] = rem;
        }
        return r1;
    }
}