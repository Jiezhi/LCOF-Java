package io.github.jiezhi.lc;

/**
 * CREATED AT: 2022/1/7
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
 * 1614. 括号的最大嵌套深度
 * https://leetcode-cn.com/problems/maximum-nesting-depth-of-the-parentheses/
 * <p>
 */
public class LC1614 {
    /**
     * 167 / 167 个通过测试用例
     * 状态：通过
     * 执行用时: 0 ms
     * 内存消耗: 36.5 MB
     * <p>
     * 1 <= s.length <= 100
     * s 由数字 0-9 和字符 '+'、'-'、'*'、'/'、'('、')' 组成
     * 题目数据保证括号表达式 s 是 有效的括号表达式
     *
     * @param s
     * @return
     */
    public int maxDepth(String s) {
        int maxDepth = 0;
        int tmpDepth = 0;
        for (char c : s.toCharArray()) {
            if (c == '(') {
                tmpDepth++;
            } else if (c == ')') {
                if (tmpDepth > maxDepth) {
                    maxDepth = tmpDepth;
                }
                tmpDepth--;
            }
        }
        return maxDepth;
    }
}
