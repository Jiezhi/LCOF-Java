package io.github.jiezhi.lc;

/**
 * CREATED AT: 2022/1/12
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Medium
 * <p>
 * SEE:
 * <p>
 * DES: https://leetcode-cn.com/problems/increasing-triplet-subsequence/
 * <p>
 */
public class LC334 {
    /**
     * 执行用时：2 ms, 在所有 Java 提交中击败了76.93%的用户
     * 内存消耗：79 MB, 在所有 Java 提交中击败了73.03%的用户
     * 通过测试用例：76 / 76
     * <p>
     * 1 <= nums.length <= 5 * 10^5
     * -2^31 <= nums[i] <= 2^31 - 1
     * <p>
     * 进阶：你能实现时间复杂度为 O(n) ，空间复杂度为 O(1) 的解决方案吗？
     *
     * @param nums
     * @return
     */
    public boolean increasingTriplet(int[] nums) {
        int num1 = nums[0];
        int num2 = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num > num2) return true;
            if (num > num1 && num < num2) num2 = num;
            else if (num < num1) {
                num1 = num;
            }
        }
        return false;
    }
}
