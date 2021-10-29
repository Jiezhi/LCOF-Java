package io.github.jiezhi.lcof;

import io.github.jiezhi.lcof.helper.ListNode;

/**
 * CREATED AT: 2021/10/29
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty:
 * <p>
 * SEE:
 * <p>
 * DES: 剑指 Offer 18. 删除链表的节点
 * 给定单向链表的头指针和一个要删除的节点的值，定义一个函数删除该节点。
 * <p>
 * 返回删除后的链表的头节点。
 * <p>
 * 注意：此题对比原题有改动
 * <p>
 */
public class LCOF018 {
    /**
     * 37 / 37 个通过测试用例
     * 状态：通过
     * 执行用时: 0 ms
     * 内存消耗: 37.8 MB
     *
     * @param head
     * @param val
     * @return
     */
    public ListNode deleteNode(ListNode head, int val) {
        ListNode tmpNode = head;
        if (tmpNode.val == val) {
            return tmpNode.next;
        }

        while (tmpNode.next.val != val) {
            tmpNode = tmpNode.next;
        }
        tmpNode.next = tmpNode.next.next;

        return head;
    }
}
