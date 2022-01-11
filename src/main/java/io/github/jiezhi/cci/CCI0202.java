package io.github.jiezhi.cci;

import io.github.jiezhi.lcof.helper.ListNode;

/**
 * CREATED AT: 2022/1/11
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Easy
 * <p>
 * SEE:
 * <p>
 * DES: https://leetcode-cn.com/problems/kth-node-from-end-of-list-lcci/
 * <p>
 */
public class CCI0202 {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：35.9 MB, 在所有 Java 提交中击败了70.17%的用户
     * 通过测试用例：208 / 208
     *
     * @param head
     * @param k    给定的 k 保证是有效的。
     * @return
     */
    public int kthToLast(ListNode head, int k) {
        if (head == null) return -1;
        ListNode slowIndex = head;
        ListNode fastIndex = head;
        for (int i = 0; i < k; i++) {
            fastIndex = fastIndex.next;
        }
        while (fastIndex != null) {
            fastIndex = fastIndex.next;
            slowIndex = slowIndex.next;
        }
        return slowIndex.val;
    }
}
