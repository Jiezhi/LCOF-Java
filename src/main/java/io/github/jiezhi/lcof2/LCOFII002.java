package io.github.jiezhi.lcof2;

/**
 * CREATED AT: 2021/12/13
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Easy
 * <p>
 * See: 29
 * <p>
 * <p> 剑指 Offer II 001. 整数除法
 * <p>
 * 给定两个整数 a 和 b ，求它们的除法的商 a/b ，要求不得使用乘号 '*'、除号 '/' 以及求余符号 '%'。
 * <p>
 * <p>
 * 注意：
 * <p>
 * 整数除法的结果应当截去（truncate）其小数部分，例如：truncate(8.345) = 8以及truncate(-2.7335) = -2
 * 假设我们的环境只能存储 32 位有符号整数，其数值范围是 [−2^31,2^31−1]。本题中，如果除法结果溢出，则返回 2^31− 1
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/xoh6Oh
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LCOFII002 {
    /**
     * 参考书本 P2~3
     * Notes:
     * 1. int 类型中最小的数是-2^31（MIN_VALUE = 0x80000000），而最大的数是2^31-1（MAX_VALUE = 0x7fffffff），此时将-2^31转为正数会导致溢出。所以可以先将正数都转为负数。
     * <p>
     * 2. 此外值也可能存在溢出的情况 （-2^31)/(-1)的结果2^31会超出正数范围。
     * <p>
     * 3. MIN_VALUE 的一半为 0xc0_000_000
     * <p>
     * 992 / 992 个通过测试用例
     * 状态：通过
     * 执行用时: 1 ms
     * 内存消耗: 35.3 MB
     *
     * @param a -2^31 <= a, b <= 2^31 - 1
     * @param b b != 0
     * @return result
     */
    public int divide(int a, int b) {
        if (a == 0) return 0;
        if (a == (Integer.MIN_VALUE) && b == -1) return Integer.MAX_VALUE;
        boolean negative = false;

        if (a > 0 && b > 0) {
            a = -a;
            b = -b;
        } else if (a < 0 && b > 0) {
            b = -b;
            negative = true;
        } else if (a > 0 && b < 0) {
            a = -a;
            negative = true;
        }

        int result = 0;
        while (a <= b) {
            int quotient = 1;
            int tmp_b = b;
            while (tmp_b > 0xc0_000_000 && tmp_b + tmp_b >= a) {
                tmp_b += tmp_b;
                quotient += quotient;
            }
            result += quotient;
            a -= tmp_b;
        }

        return negative ? -result : result;
    }
}
