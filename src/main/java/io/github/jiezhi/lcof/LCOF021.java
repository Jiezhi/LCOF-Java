package io.github.jiezhi.lcof;

/**
 * CREATED AT: 2021/10/31
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Easy
 * <p>
 * SEE:
 * <p>
 * DES: 剑指 Offer 21. 调整数组顺序使奇数位于偶数前面
 * <p>
 * 输入一个整数数组，实现一个函数来调整该数组中数字的顺序，使得所有奇数在数组的前半部分，所有偶数在数组的后半部分。
 * <p>
 * https://leetcode-cn.com/problems/diao-zheng-shu-zu-shun-xu-shi-qi-shu-wei-yu-ou-shu-qian-mian-lcof/
 * <p>
 */
public class LCOF021 {
    /**
     * 17 / 17 个通过测试用例
     * 状态：通过
     * 执行用时: 2 ms
     * 内存消耗: 46.4 MB
     * <p>
     * 0 <= nums.length <= 50000
     * 0 <= nums[i] <= 10000
     *
     * @param nums
     * @return
     */
    public int[] exchange(int[] nums) {
        if (nums.length <= 1) {
            return nums;
        }
        int l = 0;
        int h = nums.length - 1;
        int tmp;
        while (l < h) {
            while (l < h && nums[l] % 2 == 1) l++;

            while (l < h && nums[h] % 2 == 0) h--;

            if (l < h) {
                tmp = nums[l];
                nums[l] = nums[h];
                nums[h] = tmp;
            }
            l++;
            h--;
        }
        return nums;
    }
}
