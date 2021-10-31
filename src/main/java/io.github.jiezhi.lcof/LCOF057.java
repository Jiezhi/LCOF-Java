package io.github.jiezhi.lcof;

/**
 * CREATED AT: 2021/10/31
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty:
 * <p>
 * SEE:
 * <p>
 * DES: 剑指 Offer 57. 和为s的两个数字
 * 输入一个递增排序的数组和一个数字s，在数组中查找两个数，使得它们的和正好是s。如果有多对数字的和等于s，则输出任意一对即可。
 * <p>
 * https://leetcode-cn.com/problems/he-wei-sde-liang-ge-shu-zi-lcof/
 *
 * <p>
 */
public class LCOF057 {
    /**
     * 36 / 36 个通过测试用例
     * 状态：通过
     * 执行用时: 2 ms
     * 内存消耗: 55.1 MB
     * <p>
     * 1 <= nums.length <= 10^5
     * 1 <= nums[i] <= 10^6
     *
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target) {
        if (nums.length <= 1) {
            return null;
        }
        int l = 0;
        int h = nums.length - 1;
        while (l < h) {
            if (nums[l] + nums[h] == target) {
                return new int[]{nums[l], nums[h]};
            } else if (nums[l] + nums[h] < target) {
                l++;
            } else {
                h--;
            }
        }
        return null;
    }
}
