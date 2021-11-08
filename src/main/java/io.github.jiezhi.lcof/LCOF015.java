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
 * SEE: 191
 * <p>
 * DES: 剑指 Offer 15. 二进制中1的个数
 * <p>
 * 编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量).）。
 * <p>
 * <p>
 * 提示：
 * <p>
 * 请注意，在某些语言（如 Java）中，没有无符号整数类型。在这种情况下，输入和输出都将被指定为有符号整数类型，并且不应影响您的实现，因为无论整数是有符号的还是无符号的，其内部的二进制表示形式都是相同的。
 * 在 Java 中，编译器使用 二进制补码 记法来表示有符号整数。因此，在示例 3中，输入表示有符号整数 -3。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/er-jin-zhi-zhong-1de-ge-shu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * <p>
 */
public class LCOF015 {

    /**
     * 601 / 601 个通过测试用例
     * 状态：通过
     * 执行用时: 0 ms
     * 内存消耗: 35.4 MB
     * <p>
     * 输入必须是长度为 32 的 二进制串 。
     * you need to treat n as an unsigned value
     *
     * @param n
     * @return
     */
    public int hammingWeight(int n) {
        int ret = 0;
        while (n != 0) {
            n &= n - 1;
            ret++;
        }
        return ret;
    }
}
