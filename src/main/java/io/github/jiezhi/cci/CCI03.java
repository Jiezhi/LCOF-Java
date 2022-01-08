package io.github.jiezhi.cci;

import java.util.Arrays;

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
 * DES: https://leetcode-cn.com/problems/string-to-url-lcci/
 * URL化。编写一种方法，将字符串中的空格全部替换为%20。假定该字符串尾部有足够的空间存放新增字符，并且知道字符串的“真实”长度。
 *
 * <p>
 */
public class CCI03 {
    /**
     * 32 / 32 个通过测试用例
     * 状态：通过
     * 执行用时: 11 ms
     * 内存消耗: 46.1 MB
     * <p>
     * <p>
     * 字符串长度在 [0, 500000] 范围内。
     *
     * @param S
     * @param length
     * @return
     */
    public String replaceSpaces(String S, int length) {
        char[] chars = S.toCharArray();
        int spaces = 0;
        for (int i = 0; i < length; i++) {
            if (chars[i] == ' ') {
                spaces++;
            }
        }
        int i = length - 1;
        while (i >= 0 && spaces > 0) {
            if (chars[i] != ' ') {
                chars[i + spaces * 2] = chars[i];
            } else {
                spaces--;
                chars[i + spaces * 2] = '%';
                chars[i + spaces * 2 + 1] = '2';
                chars[i + spaces * 2 + 2] = '0';
            }
            i--;
        }

        return String.valueOf(chars).trim();
    }
}
