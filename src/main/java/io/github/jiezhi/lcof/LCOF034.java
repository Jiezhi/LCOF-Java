package io.github.jiezhi.lcof;

import io.github.jiezhi.lcof.helper.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * CREATED AT: 2021/11/2
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty:
 * <p>
 * SEE: 113 https://leetcode-cn.com/problems/path-sum-ii/
 * <p>
 * DES: 剑指 Offer 34. 二叉树中和为某一值的路径
 * <p>
 * 给你二叉树的根节点 root 和一个整数目标和 targetSum ，找出所有 从根节点到叶子节点 路径总和等于给定目标和的路径。
 * <p>
 * 叶子节点 是指没有子节点的节点。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/er-cha-shu-zhong-he-wei-mou-yi-zhi-de-lu-jing-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 */
public class LCOF034 {
    /**
     * 114 / 114 个通过测试用例
     * 状态：通过
     * 执行用时: 2 ms
     * 内存消耗: 38.8 MB
     * <p>
     * <p>
     * 树中节点总数在范围 [0, 5000] 内
     * -1000 <= Node.val <= 1000
     * -1000 <= targetSum <= 1000
     *
     * @param root
     * @param target
     * @return
     */
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if (root == null)
            return new ArrayList<>();
        if (root.left == null && root.right == null) {
            if (root.val == target) {
                List<List<Integer>> list = new ArrayList<>();
                List<Integer> childList = new ArrayList<>();
                childList.add(root.val);
                list.add(childList);
                return list;
            } else return new ArrayList<>();
        }
        List<List<Integer>> leftRets = null;
        if (root.left != null) {
            leftRets = pathSum(root.left, target - root.val);
            if (leftRets != null && leftRets.size() > 0) {
                for (List<Integer> ret : leftRets) {
                    ret.add(0, root.val);
                }
            }
        }
        List<List<Integer>> rightRets = null;
        if (root.right != null) {
            rightRets = pathSum(root.right, target - root.val);
            if (rightRets != null && rightRets.size() > 0) {
                for (List<Integer> ret : rightRets) {
                    ret.add(0, root.val);
                }
            }
        }
        List<List<Integer>> rets = new ArrayList<>();
        if (leftRets != null) rets.addAll(leftRets);
        if (rightRets != null) rets.addAll(rightRets);
        return rets;

    }
}
