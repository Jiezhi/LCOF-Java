package io.github.jiezhi.lcof.helper;

/**
 * CREATED AT: 2021/10/19
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public static ListNode build(int[] nums) {
        if (nums == null || nums.length == 0) return null;
        ListNode listNode = new ListNode(nums[0]);
        if (nums.length == 1) return listNode;
        ListNode node;
        ListNode pre_node = listNode;
        for (int i = 1; i < nums.length; i++) {
            node = new ListNode(nums[i]);
            pre_node.next = node;
            pre_node = node;
        }
        return listNode;
    }

    @Override
    public boolean equals(Object obj) {
        ListNode listNode1 = this;
        ListNode listNode2 = (ListNode) obj;
        while (true) {
            if (listNode1 == null && listNode2 == null) {
                return true;
            } else if (listNode1 == null || listNode2 == null) {
                return false;
            }
            if (listNode1.val != listNode2.val) return false;
            listNode1 = listNode1.next;
            listNode2 = listNode2.next;
        }
    }
}
