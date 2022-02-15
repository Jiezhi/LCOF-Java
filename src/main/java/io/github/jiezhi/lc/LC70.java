package io.github.jiezhi.lc;

/**
 * CREATED AT: 2022/2/15
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
public class LC70 {
    /**
     * Runtime: 0 ms, faster than 100.00%
     * Memory Usage: 40.9 MB, less than 14.61%
     * <p>
     * 1 <= n <= 45
     */
    public int climbStairs(int n) {
        int dp1 = 1;
        int dp2 = 2;
        int ret = 0;
        if (n < 3) return n;
        for (int i = 3; i <= n; i++) {
            ret = dp1 + dp2;
            dp1 = dp2;
            dp2 = ret;
        }
        return ret;
    }
}
