package io.github.jiezhi.lcof;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * CREATED AT: 2021/11/23
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Medium
 * <p>
 * SEE:
 * <p>
 * DES: 剑指 Offer 38. 字符串的排列
 * 输入一个字符串，打印出该字符串中字符的所有排列。
 * 你可以以任意顺序返回这个字符串数组，但里面不能有重复元素。
 * <p>
 * https://leetcode-cn.com/problems/zi-fu-chuan-de-pai-lie-lcof/
 * <p>
 * Reference: https://leetcode-cn.com/problems/zi-fu-chuan-de-pai-lie-lcof/solution/mian-shi-ti-38-zi-fu-chuan-de-pai-lie-hui-su-fa-by/
 * <p>
 */
public class LCOF038 {
    private char[] c;
    private List<String> rets;

    /**
     * 52 / 52 个通过测试用例
     * 状态：通过
     * 执行用时: 8 ms
     * 内存消耗: 42.9 MB
     *
     * @param s 1 <= s 的长度 <= 8
     * @return
     */
    public String[] permutation(String s) {
        c = s.toCharArray();
        rets = new ArrayList<>();
        dfs(0);
        return rets.toArray(new String[0]);
    }

    private void dfs(int x) {
        if (x == c.length) {
            rets.add(String.valueOf(c));
            return;
        }
        Set<Character> set = new HashSet<>();

        set.add(c[x]);
        dfs(x + 1);

        for (int i = x + 1; i < c.length; i++) {
            if (set.contains(c[i])) continue;
            set.add(c[i]);
            swap(i, x);
            dfs(x + 1);
            swap(i, x);
        }
    }

    private void swap(int i, int x) {
        char tmp = c[i];
        c[i] = c[x];
        c[x] = tmp;
    }

}
