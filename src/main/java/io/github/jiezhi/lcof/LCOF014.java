package io.github.jiezhi.lcof;

/**
 * CREATED AT: 2021/12/7
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Medium
 * <p>
 * SEE: 343
 * <p>
 * DES: 剑指 Offer 14- I. 剪绳子
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长度的 m 段（m、n都是整数，n>1并且m>1），每段绳子的长度记为 k[0],k[1]...k[m-1] 。请问 k[0]*k[1]*...*k[m-1] 可能的最大乘积是多少？例如，当绳子的长度是8时，我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/jian-sheng-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 */
public class LCOF014 {
    /**
     * 50 / 50 个通过测试用例
     * 状态：通过
     * 执行用时: 0 ms
     * 内存消耗: 35.2 MB
     *
     * @param n 2 <= n <= 58
     * @return
     */
    public int cuttingRope(int n) {
        // return 0 or raise error
        if (n < 2) return 0;
        // n = 2, return 1
        // n = 3, return 2
        if (n < 4) return n - 1;
        // waste two or three pos, whatever
        int[] dp = new int[n + 1];
        dp[2] = 2;
        dp[3] = 3;
        int ret = 0;
        for (int i = 4; i <= n; i++) {
            int j = 2;
            while (j * 2 <= i) {
                if (dp[j] * dp[i - j] > ret) ret = dp[j] * dp[i - j];
                j++;
            }
            dp[i] = ret;
        }
        return dp[n];
    }
}
