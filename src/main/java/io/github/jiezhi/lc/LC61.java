package io.github.jiezhi.lc;

import io.github.jiezhi.lcof.helper.ListNode;

/**
 * CREATED AT: 2022/3/11
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Medium
 * <p>
 * SEE:
 * <p>
 * DES: https://leetcode.com/problems/rotate-list/
 * <p>
 */
public class LC61 {

    /**
     * Runtime: 1 ms, faster than 75.83%
     * Memory Usage: 42.9 MB, less than 45.66%
     * <p>
     * The number of nodes in the list is in the range [0, 500].
     * -100 <= Node.val <= 100
     * 0 <= k <= 2 * 10^9
     *
     * @param head
     * @param k
     * @return
     */
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) return head;
        // get the listnode length l
        int length = 0;
        ListNode node = head;
        ListNode tail = head;
        while (node != null) {
            length++;
            tail = node;
            node = node.next;
        }

        // rotate k % l
        k = length - k % length;

        if (k == length || k == 0) return head;

        node = head;
        while (k > 1) {
            node = node.next;
            k--;
        }
        ListNode newHead = node.next;
        node.next = null;
        tail.next = head;
        return newHead;
    }
}
