package io.github.jiezhi.cci;

import java.util.HashMap;
import java.util.Map;

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
 * DES:https://leetcode-cn.com/problems/check-permutation-lcci/
 * <p>
 */
public class CCI02 {
    /**
     * 23 / 23 个通过测试用例
     * 状态：通过
     * 执行用时: 0 ms
     * 内存消耗: 36.3 MB
     *
     * @param s1 0 <= len(s1) <= 100
     * @param s2 0 <= len(s2) <= 100
     * @return
     */
    public boolean checkPermutation(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        Map<Character, Integer> charMap = new HashMap<>();
        for (char c : s1.toCharArray()) {
            charMap.put(c, charMap.getOrDefault(c, 0) + 1);
        }
        for (char c : s2.toCharArray()) {
            if (charMap.getOrDefault(c, 0) == 0) return false;
            charMap.put(c, charMap.get(c) - 1);
        }
        return true;
    }
}
