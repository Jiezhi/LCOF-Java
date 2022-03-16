package io.github.jiezhi.lc;

/**
 * CREATED AT: 2022/3/16
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty:
 * <p>
 * SEE:
 * <p>
 * DES:
 * <p>
 */
public class LC35 {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：40.9 MB, 在所有 Java 提交中击败了27.17%的用户
     * 通过测试用例：64 / 64
     *
     * @param nums   1 <= nums.length <= 10&4
     *               -10^4 <= nums[i] <= 10^4
     *               nums 为无重复元素的升序排列数组
     * @param target -10^4 <= target <= 10^4
     * @return
     */
    public int searchInsert(int[] nums, int target) {
        int lo = 0, hi = nums.length - 1;
        int mid;
        while (lo <= hi) {
            mid = lo + (hi - lo) / 2;

            if (nums[mid] < target) lo = mid + 1;
            else hi = mid - 1;
        }

        return lo;
    }
}
