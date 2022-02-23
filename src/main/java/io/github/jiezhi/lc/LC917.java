package io.github.jiezhi.lc;

/**
 * CREATED AT: 2022/2/23
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
public class LC917 {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：39.6 MB, 在所有 Java 提交中击败了7.90%的用户
     * 通过测试用例：115 / 115
     * <p>
     * 1 <= s.length <= 100
     * s 仅由 ASCII 值在范围 [33, 122] 的字符组成
     * s 不含 '\"' 或 '\\'
     */
    public String reverseOnlyLetters(String s) {
        char[] letters = s.toCharArray();
        int lo = 0;
        int hi = letters.length - 1;
        char tmp;
        while (lo < hi) {
            while (lo < hi && !Character.isLetter(letters[lo])) lo++;
            while (lo < hi && !Character.isLetter(letters[hi])) hi--;
            tmp = letters[lo];
            letters[lo] = letters[hi];
            letters[hi] = tmp;
            lo++;
            hi--;
        }
        return String.valueOf(letters);
    }
}
