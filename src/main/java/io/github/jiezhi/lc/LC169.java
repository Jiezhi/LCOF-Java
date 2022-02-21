package io.github.jiezhi.lc;

import java.util.Arrays;

/**
 * CREATED AT: 2022/2/21
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
public class LC169 {
    /**
     * Runtime: 5 ms, faster than 44.63%
     * Memory Usage: 57.2 MB, less than 5.16%
     * <p>
     * n == nums.length
     * 1 <= n <= 5 * 10^4
     * -2^31 <= nums[i] <= 2^31 - 1
     */
    public int majorityElement(int[] nums) {
        // Sort and return the middle num
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }

    /**
     * Runtime: 2 ms, faster than 82.16%
     * Memory Usage: 57.4 MB, less than 5.16%
     * <p>
     * n == nums.length
     * 1 <= n <= 5 * 10^4
     * -2^31 <= nums[i] <= 2^31 - 1
     */
    public int majorityElement2(int[] nums) {
        //Boyer-Moore Voting Algorithm
        // See: https://leetcode.com/problems/majority-element/solution/
        int count = 0;
        int ret = 0;
        for (int num : nums) {
            if (count == 0) ret = num;
            if (num == ret) count++;
            else count--;
        }

        return ret;
    }
}
