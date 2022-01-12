package io.github.jiezhi.cci;

import io.github.jiezhi.lcof.helper.ListNode;

/**
 * CREATED AT: 2022/1/12
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Medium
 * <p>
 * SEE:
 * <p>
 * DES: https://leetcode-cn.com/problems/partition-list-lcci/
 * 给你一个链表的头节点 head 和一个特定值 x ，请你对链表进行分隔，使得所有 小于 x 的节点都出现在 大于或等于 x 的节点之前。
 * <p>
 * 你不需要保留每个分区中各节点的初始相对位置。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/partition-list-lcci
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 */
public class CCI0204 {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：37.8 MB, 在所有 Java 提交中击败了19.66%的用户
     * 通过测试用例：166 / 166
     * <p>
     * 链表中节点的数目在范围 [0, 200] 内
     * -100 <= Node.val <= 100
     * -200 <= x <= 200
     *
     * @param head
     * @param x
     * @return
     */
    public ListNode partition(ListNode head, int x) {
        ListNode root = new ListNode(-1);
        ListNode tmpNode;
        root.next = head;
        while (head != null && head.next != null) {
            if (head.next.val < x) {
                tmpNode = head.next;
                head.next = head.next.next;
                tmpNode.next = root.next;
                root.next = tmpNode;
            } else {
                head = head.next;
            }
        }
        return root.next;
    }
}
