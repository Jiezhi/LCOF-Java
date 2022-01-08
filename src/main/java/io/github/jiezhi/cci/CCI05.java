package io.github.jiezhi.cci;

/**
 * CREATED AT: 2022/1/8
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Medium
 * <p>
 * SEE:
 * <p>
 * DES: https://leetcode-cn.com/problems/one-away-lcci/
 * <p>
 */
public class CCI05 {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.1 MB, 在所有 Java 提交中击败了84.52%的用户
     * 通过测试用例：1146 / 1146
     *
     * @param first
     * @param second
     * @return
     */
    public boolean oneEditAway(String first, String second) {
        if (first == null || second == null) return false;
        if (Math.abs(first.length() - second.length()) > 1) return false;
        if (first.length() == second.length()) {
            boolean diff = false;
            for (int i = 0; i < first.length(); i++) {
                if (first.charAt(i) != second.charAt(i)) {
                    if (diff) return false;
                    else diff = true;
                }
            }
        } else {
            String longer;
            String shorter;
            if (first.length() > second.length()) {
                longer = first;
                shorter = second;
            } else {
                longer = second;
                shorter = first;
            }
            boolean diff = false;
            int i = 0, j = 0;
            while (i < longer.length() && j < shorter.length()) {
                if (longer.charAt(i) != shorter.charAt(j)) {
                    if (diff) return false;
                    else {
                        diff = true;
                        i++;
                    }

                } else {
                    i++;
                    j++;
                }
            }
        }
        return true;
    }
}
