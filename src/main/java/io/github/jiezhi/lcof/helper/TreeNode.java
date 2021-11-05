package io.github.jiezhi.lcof.helper;

import java.util.Objects;
import java.util.stream.Stream;


public class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    TreeNode(int x) {
        val = x;
    }


    public static TreeNode build(Integer[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        }
        TreeNode[] treeNodes = new TreeNode[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == null) {
                treeNodes[i] = null;
            } else {
                treeNodes[i] = new TreeNode(nums[i]);
            }
        }
        int i = 0;
        while (i < nums.length) {
            if (2 * i + 1 < nums.length)
                treeNodes[i].left = treeNodes[2 * i + 1];
            else
                break;
            if (2 * i + 2 < nums.length)
                treeNodes[i].right = treeNodes[2 * i + 2];
            else
                break;
            i++;
        }
        return treeNodes[0];
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        TreeNode treeNode = (TreeNode) o;

        if (val != treeNode.val) return false;
        if (!Objects.equals(left, treeNode.left)) return false;
        return Objects.equals(right, treeNode.right);
    }

    @Override
    public int hashCode() {
        int result = val;
        result = 31 * result + (left != null ? left.hashCode() : 0);
        result = 31 * result + (right != null ? right.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
