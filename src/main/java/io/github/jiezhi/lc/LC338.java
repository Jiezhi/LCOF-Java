package io.github.jiezhi.lc;

/**
 * CREATED AT: 2022/3/1
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
public class LC338 {
    /**
     * Runtime: 2 ms, faster than 82.30%
     * Memory Usage: 48.3 MB, less than 24.49%
     *
     * Every pow of 2 contains 1 bit, and the rest of bits are previous group bits plus 1. And we group by pow of 2.
     * 1:1
     * ---
     *     1:1
     * 2:1 3:2
     * ---
     *     1:1 2:1 3:2
     * 4:1 5:2 6:2 7:3
     * @param n 0 <= n <= 105
     * @return
     */
    public int[] countBits(int n) {
        int[] rets = new int[n + 1];
        rets[0] = 0;
        if (n == 0) return rets;

        int pow = 0;
        int i;
        int preStart;
        while ((1 << pow) <= n) {
            preStart = 1 << pow;
            rets[preStart] = 1;
            for (i = preStart + 1; i <= Math.min(1 << (pow + 1), n); i++) {
                rets[i] = rets[i - preStart] + 1;
            }
            pow++;
        }
        return rets;
    }
}
