package io.github.jiezhi.lcof;

import io.github.jiezhi.lcof.helper.ListNode;

/**
 * CREATED AT: 2021/10/31
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty:
 * <p>
 * SEE:
 * <p>
 * DES: 剑指 Offer 25. 合并两个排序的链表
 * <p>
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 * <p>
 * https://leetcode-cn.com/problems/he-bing-liang-ge-pai-xu-de-lian-biao-lcof/
 * <p>
 */
public class LCOF025 {
    /**
     * 218 / 218 个通过测试用例
     * 状态：通过
     * 执行用时: 1 ms
     * 内存消耗: 38.6 MB
     *
     * @param l1 0 <= 链表长度 <= 1000
     * @param l2 0 <= 链表长度 <= 1000
     * @return
     */
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode head = new ListNode(-1);
        ListNode node = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                node.next = l1;
                node = node.next;
                l1 = l1.next;
            } else {
                node.next = l2;
                node = node.next;
                l2 = l2.next;
            }
        }
        if (l1 != null) {
            node.next = l1;
        } else if (l2 != null) {
            node.next = l2;
        }
        return head.next;
    }
}
