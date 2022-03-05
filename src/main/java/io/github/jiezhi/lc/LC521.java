package io.github.jiezhi.lc;

/**
 * CREATED AT: 2022/3/5
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
public class LC521 {
    /**
     *
     *
     * 1 <= a.length, b.length <= 100
     * a and b consist of lower-case English letters.
     *
     * @param a
     * @param b
     * @return
     */
    public int findLUSLength(String a, String b) {
        if (a.equals(b)) return -1;
        return Math.max(a.length(), b.length());
    }
}
