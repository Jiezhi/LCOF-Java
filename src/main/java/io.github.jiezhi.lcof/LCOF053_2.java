package io.github.jiezhi.lcof;

/**
 * CREATED AT: 2021/11/3
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty:
 * <p>
 * SEE:
 * <p>
 * DES: 剑指 Offer 53 - II. 0～n-1中缺失的数字
 * <p>
 * 一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这个数字。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/que-shi-de-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 */
public class LCOF053_2 {
    /**
     * 122 / 122 个通过测试用例
     * 状态：通过
     * 执行用时: 0 ms
     * 内存消耗: 39.1 MB
     * <p>
     * 1 <= 数组长度 <= 10000
     *
     * @param nums
     * @return
     */
    public int missingNumber(int[] nums) {
        int l = 0;
        int h = nums.length - 1;
        int mid;
        while (l <= h) {
            mid = l + (h - l) / 2;
            if (nums[mid] == mid) l = mid + 1;
            else h = mid - 1;
        }
        return l;
    }
}
