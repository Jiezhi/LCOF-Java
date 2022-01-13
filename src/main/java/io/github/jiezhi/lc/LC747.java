package io.github.jiezhi.lc;

/**
 * CREATED AT: 2022/1/13
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Easy
 * <p>
 * SEE:
 * <p>
 * DES: https://leetcode-cn.com/problems/largest-number-at-least-twice-of-others/
 * <p>
 */
public class LC747 {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：36.1 MB, 在所有 Java 提交中击败了69.98%的用户
     * 通过测试用例：232 / 232
     * <p>
     * 1 <= nums.length <= 50
     * 0 <= nums[i] <= 100
     * nums 中的最大元素是唯一的
     *
     * @param nums
     * @return
     */
    public int dominantIndex(int[] nums) {
        int ret = 0;
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > max && nums[i] >= max * 2) {
                max = nums[i];
                ret = i;
            } else if (nums[i] > max) {
                max = nums[i];
                ret = -1;
            } else if (max < nums[i] * 2) {
                ret = -1;
            }
        }
        return ret;
    }
}
