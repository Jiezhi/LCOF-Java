package io.github.jiezhi.lc;

/**
 * CREATED AT: 2022/2/14
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Easy
 * <p>
 * SEE:
 * <p>
 * DES: https://leetcode.com/problems/n-th-tribonacci-number/
 * <p>
 * Runtime: 0 ms, faster than 100.00%
 * Memory Usage: 40.9 MB, less than 10.38%
 * <p>
 */
public class LC1137 {

    /**
     * n 0 <= n <= 37
     */
    public int tribonacci(int n) {
        if (n <= 1) return n;
        if (n == 2) return 1;
        int dp0 = 0;
        int dp1 = 1;
        int dp2 = 1;
        int dp = 2;
        int i = 3;
        while (i <= n) {
            dp = dp0 + dp1 + dp2;
            dp0 = dp1;
            dp1 = dp2;
            dp2 = dp;
            i += 1;
        }
        return dp;
    }
}
