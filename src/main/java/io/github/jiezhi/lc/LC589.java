package io.github.jiezhi.lc;

import java.util.ArrayList;
import java.util.List;

/**
 * CREATED AT: 2022/3/10
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Easy
 * <p>
 * SEE:
 * <p>
 * DES:
 * <p>
 */

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}

public class LC589 {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了44.64%的用户
     * 内存消耗：41.9 MB, 在所有 Java 提交中击败了33.50%的用户
     * 通过测试用例：38 / 38
     * <p>
     * 节点总数在范围 [0, 10^4]内
     * 0 <= Node.val <= 10^4
     * n 叉树的高度小于或等于 1000
     *
     * @param root
     * @return
     */
    public List<Integer> preorder(Node root) {
        if (root == null) return new ArrayList();
        List<Integer> ret = new ArrayList<>();
        ret.add(root.val);
        for (Node child : root.children) {
            ret.addAll(preorder(child));
        }
        return ret;
    }
}
