package io.github.jiezhi.lcof;

/**
 * CREATED AT: 2021/10/16
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Easy
 * <p>
 * <p>
 * 剑指 Offer 03. 数组中重复的数字
 * 找出数组中重复的数字。
 * <p>
 * <p>
 * 在一个长度为 n 的数组 nums 里的所有数字都在 0～n-1 的范围内。数组中某些数字是重复的，但不知道有几个数字重复了，也不知道每个数字重复了几次。请找出数组中任意一个重复的数字。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/shu-zu-zhong-zhong-fu-de-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * See: 442 https://leetcode.com/problems/find-all-duplicates-in-an-array/
 */
public class LCOF003 {
    /**
     * 25 / 25 个通过测试用例
     * 状态：通过
     * 执行用时: 4 ms
     * 内存消耗: 46.2 MB
     * <p>
     * 2 <= n <= 100000, n is nums.length
     *
     * @param nums
     * @return
     */
    public int findRepeatNumber(int[] nums) {
        for (int num : nums) {
            if (nums[Math.abs(num)] < 0) {
                return Math.abs(num);
            }
            nums[Math.abs(num)] = -nums[Math.abs(num)];
        }
        return 0;
    }
}
