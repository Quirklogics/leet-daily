class Solution {
    public long minimumCost(int cost1, int cost2, int costBoth, int need1, int need2) {
       costBoth = Math.min(costBoth,cost1+cost2);
       long mn = Math.min(need1,need2);
       long cost = (long) mn * costBoth;
       cost += (need1 - mn) * (long)(Math.min(cost1, costBoth));
       cost += (need2 - mn) * (long)(Math.min(cost2, costBoth));
       return cost;
    }
}