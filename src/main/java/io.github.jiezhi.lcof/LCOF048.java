package io.github.jiezhi.lcof;

import java.util.Arrays;

/**
 * CREATED AT: 2021/10/28
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Medium
 * <p>
 * SEE: 3 https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 * <p>
 * DES: 剑指 Offer 48. 最长不含重复字符的子字符串
 * 请从字符串中找出一个最长的不包含重复字符的子字符串，计算该最长子字符串的长度。
 * https://leetcode-cn.com/problems/zui-chang-bu-han-zhong-fu-zi-fu-de-zi-zi-fu-chuan-lcof/
 * <p>
 */
public class LCOF048 {
    /**
     * 987 / 987 个通过测试用例
     * 状态：通过
     * 执行用时: 12 ms
     * 内存消耗: 39.2 MB
     * <p>
     * Optimization: lastSubstring to char[]
     * <p>
     * s.length <= 40000
     *
     * @param s
     * @return
     */
    public int lengthOfLongestSubstring(String s) {
        if (s.length() <= 1) {
            return s.length();
        }
        int lastDP = 0;
        String lastSubstring = "";
        char c;
        int index;
        for (int i = 0; i < s.length(); i++) {
            c = s.charAt(i);
            index = lastSubstring.indexOf(c);
            if (index == -1) {
                lastSubstring += c;
            } else {
                lastDP = Math.max(lastSubstring.length(), lastDP);
                lastSubstring = lastSubstring.substring(index + 1);
                lastSubstring += c;
            }
        }
        return Math.max(lastDP, lastSubstring.length());
    }
}
