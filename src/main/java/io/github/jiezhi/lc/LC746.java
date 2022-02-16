package io.github.jiezhi.lc;

/**
 * CREATED AT: 2022/2/16
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Easy
 * <p>
 * SEE:
 * <p>
 * DES:
 * <p>
 */
public class LC746 {
    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Min Cost Climbing Stairs.
     * Memory Usage: 41.5 MB, less than 35.57% of Java online submissions for Min Cost Climbing Stairs.
     * <p>
     * 2 <= cost.length <= 1000
     * 0 <= cost[i] <= 999
     */
    public int minCostClimbingStairs(int[] cost) {
        int dp0 = cost[0];
        int dp1 = cost[1];
        int ret = dp1;
        int n = cost.length;
        for (int i = 2; i < n; i++) {
            ret = cost[i] + Math.min(dp0, dp1);
            dp0 = dp1;
            dp1 = ret;
        }
        return Math.min(ret, dp0);
    }
}
