package io.github.jiezhi.lc;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * CREATED AT: 2022/3/8
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Easy
 * <p>
 * SEE:
 * <p>
 * DES: https://leetcode.com/problems/contains-duplicate/
 * <p>
 */
public class LC217 {
    /**
     * Runtime: 23 ms, faster than 26.79%
     * Memory Usage: 69.6 MB, less than 48.93%
     *
     * @param nums 1 <= nums.length <= 10^5
     *             -10^9 <= nums[i] <= 10^9
     * @return
     */
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) return true;
        }
        return false;
    }

    /**
     * Runtime: 7 ms, faster than 63.99%
     * Memory Usage: 53.8 MB, less than 15.32%
     *
     * @param nums 1 <= nums.length <= 10^5
     *             -10^9 <= nums[i] <= 10^9
     * @return
     */
    public boolean containsDuplicate2(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (set.contains(num)) return true;
            set.add(num);
        }
        return false;
    }
}
