package io.github.jiezhi.cci;

import io.github.jiezhi.lcof.helper.ListNode;

/**
 * CREATED AT: 2022/1/12
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Easy
 * <p>
 * SEE:
 * <p>
 * DES: https://leetcode-cn.com/problems/delete-middle-node-lcci/
 * <p>
 */
public class CCI0203 {
    /**
     * 执行用时 0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38 MB, 在所有 Java 提交中击败了5.20%的用户
     * 通过测试用例：41 / 41
     *
     * @param node
     */
    public void deleteNode(ListNode node) {
        if (node != null && node.next != null) {
            node.val = node.next.val;
            node.next = node.next.next;
        }

    }
}
