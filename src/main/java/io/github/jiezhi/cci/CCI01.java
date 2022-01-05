package io.github.jiezhi.cci;

import java.util.ArrayList;
import java.util.List;

/**
 * CREATED AT: 2022/1/5
 * <p>
 * PROJECT: LCOF-Java Cracking the Coding Interview
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Easy
 * <p>
 * SEE:
 * <p>
 * DES: https://leetcode-cn.com/problems/is-unique-lcci/
 * <p>
 */
public class CCI01 {
    /**
     * Question： 字符取值范围?
     * 17 / 17 个通过测试用例
     * 状态：通过
     * 执行用时: 0 ms
     * 内存消耗: 36.2 MB
     * <p>
     * 如果你不使用额外的数据结构，会很加分。
     *
     * @param astr 0 <= len(astr) <= 100
     * @return
     */
    public boolean isUnique(String astr) {
        List<Character> list = new ArrayList<>();
        for (char c : astr.toCharArray()) {
            if (list.contains(c)) {
                return false;
            }
            list.add(c);

        }
        return true;
    }
}
