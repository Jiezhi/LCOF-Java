package io.github.jiezhi.lc;

import io.github.jiezhi.lcof.helper.ListNode;

/**
 * CREATED AT: 2022/2/16
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Medium
 * <p>
 * SEE:
 * <p>
 * DES:
 * <p>
 */
public class LC24 {

    /**
     * Runtime: 0 ms, faster than 100.00% of Java online submissions for Swap Nodes in Pairs.
     * Memory Usage: 42.5 MB, less than 5.51% of Java online submissions for Swap Nodes in Pairs.
     * <p>
     * The number of nodes in the list is in the range [0, 100].
     *
     * @param head 0 <= Node.val <= 100
     * @return
     */
    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode new_head = head.next;
        head.next = new_head.next;
        new_head.next = head;

        ListNode node1 = head.next;
        ListNode node2;
        while (node1 != null && node1.next != null) {
            node2 = node1.next;
            node1.next = node2.next;
            node2.next = node1;
            head.next = node2;

            head = node1;
            node1 = node1.next;
        }
        return new_head;
    }
}
