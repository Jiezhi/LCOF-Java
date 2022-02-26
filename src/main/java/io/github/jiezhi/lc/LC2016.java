package io.github.jiezhi.lc;

/**
 * CREATED AT: 2022/2/26
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Easy
 * <p>
 * SEE:
 * <p>
 * DES:
 * <p>
 */
public class LC2016 {
    /**
     * n == nums.length
     * 2 <= n <= 1000
     * 1 <= nums[i] <= 10^9
     */
    public int maximumDifference(int[] nums) {
        int preMin = nums[0];
        int ret = -1;
        for (int num : nums) {
            if (num < preMin) {
                preMin = num;
            }
            if (num - preMin > ret) {
                ret = num - preMin;
            }
        }
        if (ret > 0) return ret;
        else return -1;
    }
}
