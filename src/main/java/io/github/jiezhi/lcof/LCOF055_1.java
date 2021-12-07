package io.github.jiezhi.lcof;

import io.github.jiezhi.lcof.helper.TreeNode;

/**
 * CREATED AT: 2021/11/5
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Easy
 * <p>
 * SEE: 104
 * <p>
 * DES: 剑指 Offer 55 - I. 二叉树的深度
 * <p>
 * 输入一棵二叉树的根节点，求该树的深度。从根节点到叶节点依次经过的节点（含根、叶节点）形成树的一条路径，最长路径的长度为树的深度。
 * <p>
 * https://leetcode-cn.com/problems/er-cha-shu-de-shen-du-lcof/
 * <p>
 */
public class LCOF055_1 {
    /**
     * 39 / 39 个通过测试用例
     * 状态：通过
     * 执行用时: 0 ms
     * 内存消耗: 38.3 MB
     * <p>
     * 节点总数 <= 10000
     *
     * @param root
     * @return
     */
    public int maxDepth(TreeNode root) {
        if (root == null) return 0;
        if (root.left == null && root.right == null) return 1;
        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;
    }
}
