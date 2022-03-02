package io.github.jiezhi.lc;

/**
 * CREATED AT: 2022/3/2
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
public class LC392 {
    /**
     * Runtime: 1 ms, faster than 88.36%
     * Memory Usage: 42.3 MB, less than 18.72%
     * <p>
     * 0 <= s.length <= 100
     * 0 <= t.length <= 10^4
     * s and t consist only of lowercase English letters.
     * <p>
     * Follow up: Suppose there are lots of incoming s, say s1, s2, ..., sk where k >= 109, and you want to check one by one to see if t has its subsequence. In this scenario, how would you change your code?
     *
     * @param s
     * @param t
     * @return
     */
    public boolean isSubsequence(String s, String t) {
        if (s.length() > t.length()) return false;
        int targetPos = 0;
        for (int i = 0; i < s.length(); i++) {
            while (targetPos < t.length() && t.charAt(targetPos) != s.charAt(i)) {
                targetPos++;
            }
            if (targetPos >= t.length()) return false;
            targetPos++;
        }
        return true;
    }
}
