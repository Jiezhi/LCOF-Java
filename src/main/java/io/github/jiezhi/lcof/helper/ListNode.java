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
        if (nums.length == 0) return null;
        ListNode listNode = new ListNode(nums[0]);
        if (nums.length == 1) return listNode;
        ListNode node = listNode;
        for (int i = 1; i < nums.length; i++) {
            node = new ListNode(nums[i]);
            node = node.next;
        }
        return listNode;
    }

}
