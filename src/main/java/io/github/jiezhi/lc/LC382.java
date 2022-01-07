package io.github.jiezhi.lc;

import io.github.jiezhi.lcof.helper.ListNode;

import java.util.Random;

/**
 * CREATED AT: 2022/1/7
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Medium
 * <p>
 * SEE:
 * <p>
 * DES: https://leetcode-cn.com/problems/linked-list-random-node/
 * <p>
 */
public class LC382 {
    private final ListNode listNode;

    public LC382(ListNode head) {
        listNode = head;
    }

    /**
     * 8 / 8 个通过测试用例
     * 状态：通过
     * 执行用时: 14 ms
     * 内存消耗: 40.2 MB
     *
     * @return
     */
    public int getRandom() {
        int k = 1;
        ListNode currentNode = listNode;
        int ret = 0;
        while (currentNode != null) {
            if (Math.random() < 1.0 / k) {
                ret = currentNode.val;
            }
            k++;
            currentNode = currentNode.next;
        }
        return ret;
    }
}
