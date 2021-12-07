package io.github.jiezhi.lcof;

import io.github.jiezhi.lcof.helper.TreeNode;

import java.util.Arrays;

/**
 * CREATED AT: 2021/11/8
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty:
 * <p>
 * <p>剑指 Offer 07. 重建二叉树
 * <p>
 * 输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。
 * <p>
 * 假设输入的前序遍历和中序遍历的结果中都不含重复的数字。
 * <p>
 * https://leetcode-cn.com/problems/zhong-jian-er-cha-shu-lcof/
 */
public class LCOF007 {
    /**
     * 203 / 203 个通过测试用例
     * 状态：通过
     * 执行用时: 10 ms
     * 内存消耗: 88.3 MB
     * <p>
     * 0 <= 节点个数 <= 5000
     * TODO: build a hashmap for inorder array
     *
     * @param preorder
     * @param inorder
     * @return
     */
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        if (preorder.length == 0) return null;
        int root = preorder[0];
        TreeNode rootNode = new TreeNode(root);
        if (preorder.length == 1) return new TreeNode(root);
        int index = 0;
        while (index < inorder.length) {
            if (inorder[index] == root) {
                break;
            }
            index++;
        }
        rootNode.left = buildTree(Arrays.copyOfRange(preorder, 1, index + 1), Arrays.copyOfRange(inorder, 0, index));
        rootNode.right = buildTree(Arrays.copyOfRange(preorder, index + 1, preorder.length), Arrays.copyOfRange(inorder, index + 1, inorder.length));
        return rootNode;
    }
}
