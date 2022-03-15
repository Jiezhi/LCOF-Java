package io.github.jiezhi.cci;

import io.github.jiezhi.lcof.helper.ListNode;

/**
 * CREATED AT: 2022/3/15
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
public class CCI0206 {
    /**
     * 执行用时：1 ms, 在所有 Java 提交中击败了95.30%的用户
     * 内存消耗：43.8 MB, 在所有 Java 提交中击败了39.48%的用户
     * 通过测试用例：26 / 26
     *
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        if (head == null) return true;
        ListNode node = head;
        int size = 0;
        while (node != null) {
            size++;
            node = node.next;
        }
        int[] arr = new int[size];

        node = head;
        int pos = 0;
        while (node != null) {
            arr[pos] = node.val;
            node = node.next;
            pos++;
        }

        int lo = 0, hi = size - 1;
        while (lo < hi) {
            if (arr[lo] != arr[hi]) return false;
            lo++;
            hi--;
        }
        return true;
    }
}
