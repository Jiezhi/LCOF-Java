package io.github.jiezhi.cci;

/**
 * CREATED AT: 2022/1/12
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Easy
 * <p>
 * SEE:
 * <p>
 * DES: https://leetcode-cn.com/problems/string-rotation-lcci/
 * <p>
 */
public class CCI0109 {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.2 MB, 在所有 Java 提交中击败了45.82%的用户
     * 通过测试用例：30 / 30
     * <p>
     * 提示：
     * <p>
     * 字符串长度在[0, 100000]范围内。
     * 说明:
     * <p>
     * 你能只调用一次检查子串的方法吗？
     *
     * @param s1
     * @param s2
     * @return
     */
    public boolean isFlipedString(String s1, String s2) {
        if (s1 == null || s2 == null) return false;
        if (s1.length() != s2.length()) return false;
        int n = s1.length();
        if (s1.equals(s2)) return true;
        for (int i = 0; i < s1.length() - 1; i++) {
            if (s1.charAt(i) == s2.charAt(n - 1) && s1.charAt(i + 1) == s2.charAt(0) && s2.charAt(n - i - 1) == s1.charAt(0) && s2.charAt(n - i - 2) == s1.charAt(n - 1)) {
                if (s1.equals(s2.substring(n - i - 1) + s2.substring(0, n - i - 1))) return true;
            }
        }
        return false;
    }
}
