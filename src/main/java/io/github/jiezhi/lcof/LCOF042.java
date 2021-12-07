package io.github.jiezhi.lcof;

/**
 * CREATED AT: 2021/10/27
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Easy
 * <p>
 * SEE: 53 https://leetcode-cn.com/problems/maximum-subarray/
 * <p>
 * DES: 剑指 Offer 42. 连续子数组的最大和
 * <p>
 * 输入一个整型数组，数组中的一个或连续多个整数组成一个子数组。求所有子数组的和的最大值。
 * <p>
 * 要求时间复杂度为O(n)。
 * <p>
 * https://leetcode-cn.com/problems/lian-xu-zi-shu-zu-de-zui-da-he-lcof/
 * <p>
 */
public class LCOF042 {
    /**
     * 202 / 202 个通过测试用例
     * 状态：通过
     * 执行用时: 1 ms
     * 内存消耗: 45.2 MB
     * <p>
     * 1 <= arr.length <= 10^5
     * <p>
     * -100 <= arr[i] <= 100
     *
     * @param nums
     * @return
     */
    public int maxSubArray(int[] nums) {
        int maxRet = nums[0];
        int lastValue = nums[0];
        for (int i = 1; i < nums.length; i++) {
            lastValue = Math.max(nums[i], nums[i] + lastValue);
            maxRet = Math.max(maxRet, lastValue);
        }
        return maxRet;
    }
}
