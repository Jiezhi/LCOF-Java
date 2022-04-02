package io.github.jiezhi.lc;

/**
 * CREATED AT: 2022/4/2
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty:
 * <p>
 * SEE:
 * <p>
 * DES:
 * <p>
 */
public class LC680 {
    private String s;

    /**
     * Runtime: 4 ms, faster than 99.96%
     * Memory Usage: 42.7 MB, less than 94.97%
     * <p>
     * 1 <= s.length <= 10^5
     * s consists of lowercase English letters.
     *
     * @param s
     * @return
     */
    public boolean validPalindrome(String s) {
        this.s = s;

        int lo = 0, hi = s.length() - 1;
        boolean diff = false;
        while (lo < hi) {
            if (s.charAt(lo) != s.charAt(hi)) {
                return (valid(lo, hi - 1) || valid(lo + 1, hi));
            } else {
                lo++;
                hi--;
            }
        }
        return true;
    }

    private boolean valid(int lo, int hi) {
        while (lo < hi) {
            if (s.charAt(lo) != s.charAt(hi)) return false;
            lo++;
            hi--;
        }
        return true;
    }
}
