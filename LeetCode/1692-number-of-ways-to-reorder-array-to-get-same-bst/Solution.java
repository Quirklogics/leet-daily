class Solution {
    int MOD = 1_000_000_007;
    private long[][] pascal;

    public int solve(List<Integer> nums) {
        int n = nums.size();
        if (n < 3)
            return 1;
        int root = nums.get(0);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (int i = 1; i < n; i++) {
            if (nums.get(i) < root)
                left.add(nums.get(i));
            else
                right.add(nums.get(i));
        }
        long leftC = solve(left);
        long rightC = solve(right);
        long way = leftC * rightC % MOD;
        way = way * pascal[n - 1][left.size()] % MOD;
        return (int) way;
    }

    public int numOfWays(int[] nums) {
        int n = nums.length;
        pascal = new long[n + 1][n + 1];
        for (int i = 0; i <= n; i++) {
            pascal[i][0] = 1;
            pascal[i][i] = 1;
            for (int j = 1; j < i; j++) {
                pascal[i][j] = (pascal[i - 1][j - 1] + pascal[i - 1][j]) % MOD;
            }
        }
        List<Integer> list = new ArrayList<>();
        for (int num : nums) {
            list.add(num);
        }
        return (int) ((solve(list) - 1 + MOD) % MOD);
    }
}