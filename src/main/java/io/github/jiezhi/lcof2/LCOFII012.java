package io.github.jiezhi.lcof2;

import java.util.Arrays;

/**
 * CREATED AT: 2021/12/16
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Easy
 * <p> See: 724
 * <p> 剑指 Offer II 012. 左右两边子数组的和相等
 * <p>
 * 给你一个整数数组 nums ，请计算数组的 中心下标 。
 * <p>
 * 数组 中心下标 是数组的一个下标，其左侧所有元素相加的和等于右侧所有元素相加的和。
 * <p>
 * 如果中心下标位于数组最左端，那么左侧数之和视为 0 ，因为在下标的左侧不存在元素。这一点对于中心下标位于数组最右端同样适用。
 * <p>
 * 如果数组有多个中心下标，应该返回 最靠近左边 的那一个。如果数组不存在中心下标，返回 -1 。
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/tvdfij
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class LCOFII012 {
    /**
     * 742 / 742 个通过测试用例
     * 状态：通过
     * 执行用时: 5 ms
     * 内存消耗: 39.4 MB
     * <p>
     *
     * @param nums 1 <= nums.length <= 10^4
     *             -1000 <= nums[i] <= 1000
     * @return result
     */
    public int pivotIndex(int[] nums) {
        if (nums.length == 0) return -1;
        int leftSum = 0;
        int rightSum = Arrays.stream(nums).sum();
        int index = 0;

        while (index < nums.length - 1) {
            if (rightSum - nums[index] == leftSum) {
                return index;
            } else {
                rightSum -= nums[index];
                leftSum += nums[index];
            }
            index++;
        }
        if (leftSum == 0) {
            return index;
        }
        return -1;
    }
}
