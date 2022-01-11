package io.github.jiezhi.cci;

import io.github.jiezhi.lcof.helper.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * CREATED AT: 2022/1/11
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Easy
 * <p>
 * SEE:
 * <p>
 * DES: https://leetcode-cn.com/problems/remove-duplicate-node-lcci/
 * <p>
 */
public class CCI0201 {
    /**
     * 执行用时：5 ms, 在所有 Java 提交中击败了62.74%的用户
     * 内存消耗：39.8 MB, 在所有 Java 提交中击败了46.99%的用户
     * 通过测试用例：35 / 35
     * <p>
     * 链表长度在[0, 20000]范围内。
     * 链表元素在[0, 20000]范围内。
     *
     * @param head
     * @return
     */
    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null) {
            return head;
        }
        Set<Integer> nodeSet = new HashSet<>();
        nodeSet.add(head.val);
        ListNode node = head;
        while (node.next != null) {
            if (nodeSet.contains(node.next.val)) {
                node.next = node.next.next;
            } else {
                nodeSet.add(node.next.val);
                node = node.next;
            }
        }
        return head;
    }
}
