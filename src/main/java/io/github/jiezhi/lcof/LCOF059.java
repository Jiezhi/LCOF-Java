package io.github.jiezhi.lcof;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

/**
 * CREATED AT: 2021/11/16
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Hard
 * <p>
 * SEE:
 * <p>
 * DES: 剑指 Offer 59 - I. 滑动窗口的最大值
 * <p>
 * 给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。
 * <p>
 * https://leetcode-cn.com/problems/hua-dong-chuang-kou-de-zui-da-zhi-lcof/
 * <p>
 */
public class LCOF059 {
    /**
     * 18 / 18 个通过测试用例
     * 状态：通过
     * 执行用时: 14 ms
     * 内存消耗: 47.4 MB
     * <p>
     * 你可以假设 k 总是有效的，在输入数组不为空的情况下，1 ≤ k ≤ 输入数组的大小。
     *
     * @param nums
     * @param k
     * @return
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length == 0 || k < 1 || k > nums.length) {
            return new int[]{};
        }
        ArrayDeque<int[]> queue = new ArrayDeque<>(k);
        for (int i = 0; i < k; i++) {
            while (!queue.isEmpty() && queue.getLast()[0] <= nums[i]) {
                queue.removeLast();
            }
            queue.add(new int[]{nums[i], i});
        }
        List<Integer> ret = new ArrayList<>();
        ret.add(queue.getFirst()[0]);
        for (int i = k; i < nums.length; i++) {
            if (queue.getFirst()[1] <= i - k) {
                queue.removeFirst();
            }
            while (!queue.isEmpty() && queue.getLast()[0] <= nums[i]) {
                queue.removeLast();
            }

            queue.add(new int[]{nums[i], i});
            ret.add(queue.getFirst()[0]);
        }
        return ret.stream().mapToInt(Integer::intValue).toArray();
    }
}
