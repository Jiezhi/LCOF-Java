package io.github.jiezhi.lcof;

/**
 * CREATED AT: 2021/10/28
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Medium
 * <p>
 * SEE:
 * <p>
 * DES: 剑指 Offer 46. 把数字翻译成字符串
 * <p>
 * 给定一个数字，我们按照如下规则把它翻译为字符串：0 翻译成 “a” ，1 翻译成 “b”，……，11 翻译成 “l”，……，25 翻译成 “z”。一个数字可能有多个翻译。请编程实现一个函数，用来计算一个数字有多少种不同的翻译方法。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/ba-shu-zi-fan-yi-cheng-zi-fu-chuan-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 * <p>
 */
public class LCOF046 {
    /**
     * 49 / 49 个通过测试用例
     * 状态：通过
     * 执行用时: 0 ms
     * 内存消耗: 35.1 MB
     * <p>
     * 0 <= num < 2^31
     *
     * @param num
     * @return
     */
    public int translateNum(int num) {
        String numStr = Integer.toString(num);
        int prelastDP = 1;
        int lastDP = 1;
        int curDP;
        for (int i = 1; i < numStr.length(); i++) {
            if (numStr.charAt(i - 1) == '1') {
                curDP = lastDP + prelastDP;
            } else if (numStr.charAt(i - 1) == '2' && numStr.charAt(i) < '6') {
                curDP = lastDP + prelastDP;
            } else {
                curDP = lastDP;
            }
            prelastDP = lastDP;
            lastDP = curDP;
        }
        return lastDP;
    }
}
