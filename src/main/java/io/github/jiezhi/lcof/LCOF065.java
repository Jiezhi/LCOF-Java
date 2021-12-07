package io.github.jiezhi.lcof;

/**
 * CREATED AT: 2021/11/8
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty:
 * <p>
 * SEE:
 * <p>
 * DES: 剑指 Offer 65. 不用加减乘除做加法
 * <p>
 * 写一个函数，求两个整数之和，要求在函数体内不得使用 “+”、“-”、“*”、“/” 四则运算符号。
 * <p>
 */
public class LCOF065 {
    /**
     * 51 / 51 个通过测试用例
     * 状态：通过
     * 执行用时: 0 ms
     * 内存消耗: 34.9 MB
     * <p>
     * a, b 均可能是负数或 0
     * 结果不会溢出 32 位整数
     *
     * @param a
     * @param b
     * @return
     */
    public int add(int a, int b) {
        int sum;

        while (b != 0) {
            sum = a ^ b;
            b = (a & b) << 1;
            a = sum;
        }
        return a;
    }
}
