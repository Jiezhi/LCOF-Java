package io.github.jiezhi.lc;

import io.github.jiezhi.lcof.helper.TreeNode;

import java.util.Arrays;

/**
 * CREATED AT: 2022/3/15
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty:Easy
 * <p>
 * SEE:
 * <p>
 * DES:
 * <p>
 */
public class LC108 {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.1 MB, 在所有 Java 提交中击败了42.54%的用户
     * 通过测试用例：31 / 31
     *
     * @param nums 1 <= nums.length <= 10^4
     *             -104 <= nums[i] <= 10^4
     *             nums 按 严格递增 顺序排列
     * @return
     */
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        int mid = nums.length / 2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, mid));
        root.right = sortedArrayToBST(Arrays.copyOfRange(nums, mid + 1, nums.length));
        return root;
    }
}
