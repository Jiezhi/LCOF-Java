package io.github.jiezhi.cci;

/**
 * CREATED AT: 2022/1/12
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty:
 * <p>
 * SEE:
 * <p>
 * DES: https://leetcode-cn.com/problems/three-steps-problem-lcci/
 * 三步问题。有个小孩正在上楼梯，楼梯有n阶台阶，小孩一次可以上1阶、2阶或3阶。实现一种方法，计算小孩有多少种上楼梯的方式。结果可能很大，你需要对结果模1000000007。
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/three-steps-problem-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 */
public class CCI0801 {
    /**
     * 执行用时：19 ms, 在所有 Java 提交中击败了63.79%的用户
     * 内存消耗：35.1 MB, 在所有 Java 提交中击败了87.41%的用户
     * 通过测试用例：32 / 32
     *
     * @param n n范围在[1, 1000000]之间
     * @return
     */
    public int waysToStep(int n) {
        if (n < 3) return n;
        int dp0 = 1;
        int dp1 = 1;
        int dp2 = 2;
        int tmp;
        for (int i = 2; i < n; i++) {
            tmp = dp2 + dp1;
            tmp %= 1000000007;
            tmp += dp0;
            tmp %= 1000000007;
            dp0 = dp1;
            dp1 = dp2;
            dp2 = tmp;
        }
        return dp2;
    }
}
