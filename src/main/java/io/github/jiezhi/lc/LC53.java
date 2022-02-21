package io.github.jiezhi.lc;

/**
 * CREATED AT: 2022/2/19
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
public class LC53 {
    /**
     * Runtime: 1 ms, faster than 100.00%
     * Memory Usage: 73.1 MB, less than 65.31%
     * 1 <= nums.length <= 10^5
     * -10^4 <= nums[i] <= 10^4
     */
    public int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int tmpSum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            tmpSum = Math.max(nums[i], tmpSum + nums[i]);
            maxSum = Math.max(tmpSum, maxSum);
        }
        return maxSum;
    }
}
