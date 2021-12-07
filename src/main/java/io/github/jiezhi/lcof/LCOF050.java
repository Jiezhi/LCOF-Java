package io.github.jiezhi.lcof;

import java.util.HashSet;
import java.util.Set;

/**
 * CREATED AT: 2021/12/06
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Easy
 * <p>
 * SEE:
 * <p>
 * DES: 剑指 Offer 50. 第一个只出现一次的字符
 * 在字符串 s 中找出第一个只出现一次的字符。如果没有，返回一个单空格。 s 只包含小写字母。
 * https://leetcode-cn.com/problems/di-yi-ge-zhi-chu-xian-yi-ci-de-zi-fu-lcof/
 * <p>
 */
public class LCOF050 {
    /**
     * 104 / 104 个通过测试用例
     * 状态：通过
     * 执行用时: 7 ms
     * 内存消耗: 38.6 MB
     *
     * @param s 0 <= s 的长度 <= 50000
     * @return result
     */
    public char firstUniqChar(String s) {
        if (s.length() == 0) return ' ';
        char[] chars = s.toCharArray();
        Set<Character> set = new HashSet<>();

        for (int i = 0; i < chars.length; i++) {
            if (set.contains(chars[i])) {
                continue;
            }
            boolean found = true;
            for (int j = i + 1; j < chars.length; j++) {
                if (chars[i] == chars[j]) {
                    set.add(chars[j]);
                    found = false;
                    break;
                }
            }
            if (found) {
                return chars[i];
            }
        }
        return ' ';
    }
}
