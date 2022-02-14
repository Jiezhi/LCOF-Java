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
 * <p> https://leetcode.com/problems/fibonacci-number/
 * DES: Runtime: 16 ms, faster than 11.51%
 * Memory Usage: 41.6 MB, less than 6.06%
 * <p>
 */
public class LC509 {

    private int[] memo;

    /**
     * @param n 0 <= n <= 30
     * @return
     */
    public int fib(int n) {
        if (n < 2) return n;
        memo = new int[n + 1];
        memo[0] = 0;
        memo[1] = 1;
        return dp(n);
    }

    private int dp(int n) {
        if (n < 2) return n;
        if (memo[n] > 0) {
            return memo[n];
        }
        return dp(n - 1) + dp(n - 2);
    }
}
