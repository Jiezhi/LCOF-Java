package io.github.jiezhi.lcof;

import io.github.jiezhi.lcof.helper.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;

/**
 * CREATED AT: 2021/11/23
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Medium
 * <p>
 * SEE:
 * <p>
 * DES: 剑指 Offer 26. 树的子结构
 * <p>
 * 输入两棵二叉树A和B，判断B是不是A的子结构。(约定空树不是任意一个树的子结构)
 * <p>
 * B是A的子结构， 即 A中有出现和B相同的结构和节点值。
 * <p>
 * https://leetcode-cn.com/problems/shu-de-zi-jie-gou-lcof/
 * <p>
 */
public class LCOF026 {
    /**
     * 48 / 48 个通过测试用例
     * 状态：通过
     * 执行用时: 4 ms
     * 内存消耗: 40.8 MB
     * <p>
     *
     * @param A 0 <= 节点个数 <= 10000
     * @param B 0 <= 节点个数 <= 10000, 约定空树不是任意一个树的子结构
     * @return B是否为A的子结构
     */
    public boolean isSubStructure(TreeNode A, TreeNode B) {
        if (B == null) return false;
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.offer(A);
        TreeNode node;
        while (!deque.isEmpty()) {
            node = deque.poll();
            if (node.val == B.val && contains(node, B)) {
                return true;
            }
            if (node.left != null) deque.offer(node.left);
            if (node.right != null) deque.offer(node.right);
        }
        return false;
    }

    /**
     * @param A
     * @param B
     * @return Whether A contains B
     */
    private boolean contains(TreeNode A, TreeNode B) {
        if (B == null) return true;
        if (A == null || B.val != A.val) return false;
        return contains(A.left, B.left) && contains(A.right, B.right);
    }
}
