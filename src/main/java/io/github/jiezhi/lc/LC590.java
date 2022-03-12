package io.github.jiezhi.lc;

import java.util.ArrayList;
import java.util.List;

/**
 * CREATED AT: 2022/3/12
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty:
 * <p>
 * SEE:
 * <p>
 * DES:
 * <p>
 */
public class LC590 {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了45.24%的用户
     * 内存消耗： 42.2 MB , 在所有 Java 提交中击败了 15.60% 的用户
     * 通过测试用例： 38 / 38
     *
     * @param root 节点总数在范围 [0, 10^4] 内
     *             0 <= Node.val <= 10^4
     *             n 叉树的高度小于或等于 1000
     * @return
     */
    public List<Integer> postorder(Node root) {
        List<Integer> ret = new ArrayList<>();
        if (root == null) return ret;

        for (Node c : root.children) {
            ret.addAll(postorder(c));
        }
        ret.add(root.val);
        return ret;
    }
}
