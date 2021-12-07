package io.github.jiezhi.lcof;

/**
 * CREATED AT: 2021/11/3
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Easy
 * <p>
 * SEE:
 * <p>
 * DES:剑指 Offer 53 - I. 在排序数组中查找数字 I
 * 统计一个数字在排序数组中出现的次数。
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/zai-pai-xu-shu-zu-zhong-cha-zhao-shu-zi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 */
public class LCOF053 {
    /**
     * 88 / 88 个通过测试用例
     * 状态：通过
     * 执行用时: 0 ms
     * 内存消耗: 41.3 MB
     * <p>
     * <p>
     * 0 <= nums.length <= 105
     * -10^9<= nums[i]<= 10^9
     * nums是一个非递减数组
     * -10^9<= target<= 10^9
     *
     * @param nums
     * @param target
     * @return
     */
    public int search(int[] nums, int target) {
        if (nums.length == 0) return 0;
        int l = 0;
        int h = nums.length - 1;
        int mid = 0;
        while (l <= h) {
            mid = l + (h - l) / 2;
            if (nums[mid] == target) break;
            if (nums[mid] < target) l = mid + 1;
            if (nums[mid] > target) h = mid - 1;
        }
        if (nums[mid] != target) return 0;
        int cnt = 1;
        l = mid - 1;
        while (l >= 0) {
            if (nums[l] == target) {
                cnt++;
                l--;
            } else {
                break;
            }
        }
        h = mid + 1;
        while (h < nums.length) {
            if (nums[h] == target) {
                cnt++;
                h++;
            } else {
                break;
            }
        }
        return cnt;
    }
}
