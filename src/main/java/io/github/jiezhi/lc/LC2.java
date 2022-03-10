package io.github.jiezhi.lc;

import io.github.jiezhi.lcof.helper.ListNode;

/**
 * CREATED AT: 2022/3/10
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
public class LC2 {
    /**
     * Runtime: 1 ms, faster than 100.00%
     * Memory Usage: 41.2 MB, less than 36.30%
     * <p>
     * The number of nodes in each linked list is in the range [1, 100].
     * 0 <= Node.val <= 9
     * It is guaranteed that the list represents a number that does not have leading zeros.
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carrier = 0;
        int num;
        ListNode head = new ListNode(0);
        ListNode node = head;
        while (l1 != null || l2 != null || carrier > 0) {
            num = 0;
            if (l1 != null) {
                num += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                num += l2.val;
                l2 = l2.next;
            }
            if (carrier > 0) num += carrier;

            if (num >= 10) {
                node.next = new ListNode(num - 10);
                carrier = 1;
            } else {
                node.next = new ListNode(num);
                carrier = 0;
            }
            node = node.next;
        }
        return head.next;
    }
}
