package io.github.jiezhi.lc;

/**
 * CREATED AT: 2022/3/5
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Medium
 * <p>
 * SEE:
 * <p>
 * DES:
 * <p>
 */
public class LC740 {

    /**
     * Runtime: 1 ms, faster than 100.00%
     * Memory Usage: 41.2 MB, less than 81.79%
     *
     * @param nums 1 <= nums.length <= 2 * 10^4
     *             1 <= nums[i] <= 10^4
     * @return
     */
    public int deleteAndEarn(int[] nums) {
        int[] cnts = new int[10001];
        int max_num = nums[0];
        for (int num : nums) {
            max_num = Math.max(max_num, num);
            cnts[num] += 1;
        }

        int[] dp = new int[max_num + 1];
        dp[0] = 0;
        dp[1] = cnts[1];
        for (int i = 2; i <= max_num; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + cnts[i] * i);
        }

        return dp[max_num];
    }
}
