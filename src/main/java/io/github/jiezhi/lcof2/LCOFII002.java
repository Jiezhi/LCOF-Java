package io.github.jiezhi.lcof2;

/**
 * CREATED AT: 2021/12/13
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Easy
 * <p>
 * <p> 剑指 Offer II 002. 二进制加法
 * 给定两个 01 字符串 a 和 b ，请计算它们的和，并以二进制字符串的形式输出。
 * <p>
 * 输入为 非空 字符串且只包含数字 1 和 0。
 * <p>
 * https://leetcode-cn.com/problems/JFETK5/
 */
public class LCOFII002 {
    /**
     * 294 / 294 个通过测试用例
     * 状态：通过
     * 执行用时: 2 ms
     * 内存消耗: 37.9 MB
     * <p>
     * 每个字符串仅由字符 '0' 或 '1' 组成。
     * 字符串如果不是 "0" ，就都不含前导零。
     *
     * @param a 1 <= a.length, b.length <= 10^4
     * @param b 1 <= a.length, b.length <= 10^4
     * @return result
     */
    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;
        int value;
        int valueA;
        int valueB;

        while (i >= 0 || j >= 0 || carry > 0) {
            if (i >= 0 && a.charAt(i) == '1') {
                valueA = 1;
            } else {
                valueA = 0;
            }
            if (j >= 0 && b.charAt(j) == '1') {
                valueB = 1;
            } else {
                valueB = 0;
            }
            value = valueA + valueB + carry;
            carry = value / 2;
            sb.append(value % 2);
            i--;
            j--;
        }
        return sb.reverse().toString();
    }
}
