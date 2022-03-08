package io.github.jiezhi.lc;

import io.github.jiezhi.lcof.helper.ListNode;

/**
 * CREATED AT: 2022/3/8
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
public class LC141 {
    /**
     * Runtime: 0 ms, faster than 100.00%
     * Memory Usage: 45.5 MB, less than 44.98%
     *
     * @param head The number of the nodes in the list is in the range [0, 10^4].
     *             -10^5 <= Node.val <= 10^5
     *             pos is -1 or a valid index in the linked-list.
     * @return
     */
    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;

            if (fast == slow) return true;
        }
        return false;
    }
}
