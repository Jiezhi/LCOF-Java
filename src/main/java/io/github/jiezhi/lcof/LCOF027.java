package io.github.jiezhi.lcof;

import io.github.jiezhi.lcof.helper.TreeNode;

/**
 * CREATED AT: 2021/10/27
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Easy
 * <p>
 * SEE: 226 https://leetcode-cn.com/problems/invert-binary-tree/
 * <p>
 * DES: 剑指 Offer 27. 二叉树的镜像
 * <p>
 * 请完成一个函数，输入一个二叉树，该函数输出它的镜像。
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/er-cha-shu-de-jing-xiang-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 *
 *
 * <p>
 */
public class LCOF027 {
    /**
     * 68 / 68 个通过测试用例
     * 状态：通过
     * 执行用时: 0 ms
     * 内存消耗: 35.7 MB
     * <p>
     * 0 <= 节点个数 <= 1000
     *
     * @param root
     * @return
     */
    public TreeNode mirrorTree(TreeNode root) {
        if (root == null) {
            return root;
        }
        TreeNode tmp = root.left;
        root.left = root.right;
        root.right = tmp;
        mirrorTree(root.left);
        mirrorTree(root.right);
        return root;
    }
}
