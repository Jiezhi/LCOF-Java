package io.github.jiezhi.cci;


/**
 * CREATED AT: 2022/1/8
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Easy
 * <p>
 * SEE:
 * <p>
 * DES: https://leetcode-cn.com/problems/palindrome-permutation-lcci/
 * <p>
 */
public class CCI04 {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：36.2 MB, 在所有 Java 提交中击败了43.28%的用户
     * 通过测试用例：27 / 27
     * <p>
     * <p>
     *
     * @param s 假定 s 只含有字母
     * @return
     */
    public boolean canPermutePalindrome(String s) {
        int[] letters = new int[128];
        for (char c : s.toCharArray()) {
            letters[c] += 1;
        }
        boolean foundOdd = false;
        for (int value : letters) {
            if ((value & 1) != 0) {
                if (!foundOdd) foundOdd = true;
                else return false;
            }
        }
        return true;
    }
}
