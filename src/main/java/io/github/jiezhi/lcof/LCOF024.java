package io.github.jiezhi.lcof;

import io.github.jiezhi.lcof.helper.ListNode;

import java.util.Stack;

/**
 * CREATED AT: 2021/10/20
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Easy
 * <p>
 * SEE: 206
 * <p>
 * DES: 剑指 Offer 24. 反转链表
 * 定义一个函数，输入一个链表的头节点，反转该链表并输出反转后链表的头节点。
 * https://leetcode-cn.com/problems/fan-zhuan-lian-biao-lcof/
 * <p>
 */
public class LCOF024 {
    /**
     * 27 / 27 个通过测试用例
     * 状态：通过
     * 执行用时: 1 ms
     * 内存消耗: 38.2 MB
     * <p>
     * 0 <= 节点个数 <= 5000
     *
     * @param head
     * @return
     */
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return head;
        }
        Stack<ListNode> stack = new Stack();
        ListNode node = head;
        while (node != null) {
            stack.add(node);
            node = node.next;
        }
        head = stack.pop();
        ListNode pre_node = head;
        while (!stack.isEmpty()) {
            node = stack.pop();
            pre_node.next = node;
            pre_node = node;
        }
        pre_node.next = null;
        return head;
    }
}
