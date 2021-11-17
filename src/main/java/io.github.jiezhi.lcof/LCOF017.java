package io.github.jiezhi.lcof;

/**
 * CREATED AT: 2021/11/17
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Easy
 * <p>
 * SEE:
 * <p>
 * DES: 剑指 Offer 17. 打印从1到最大的n位数
 * <p>
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 * <p>
 * https://leetcode-cn.com/problems/da-yin-cong-1dao-zui-da-de-nwei-shu-lcof/
 * <p>
 */
public class LCOF017 {
    /**
     * 5 / 5 个通过测试用例
     * 状态：通过
     * 执行用时: 1 ms
     * 内存消耗: 46.6 MB
     * <p>
     * 用返回一个整数列表来代替打印
     * n 为正整数
     *
     * @param n
     * @return
     */
    public int[] printNumbers(int n) {
        if (n <= 0) return null;
        int maxValue = (int) Math.pow(10, n) - 1;
        int[] rets = new int[maxValue];
        for (int i = 1; i <= maxValue; i++) {
            rets[i - 1] = i;
        }
        return rets;
    }
}
