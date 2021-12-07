package io.github.jiezhi.lcof;

import io.github.jiezhi.lcof.helper.ListNode;

import java.util.ArrayList;
import java.util.List;

/**
 * CREATED AT: 2021/10/19
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty:
 * <p>
 * <p>
 */
public class LCOF006 {
    /**
     * 24 / 24 个通过测试用例
     * 状态：通过
     * 执行用时: 7 ms
     * 内存消耗: 38.7 MB
     * <p>
     * 0 <= 链表长度 <= 10000
     *
     * @param head
     * @return
     */
    public int[] reversePrint(ListNode head) {
        List<Integer> ret = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            ret.add(0, node.val);
            node = node.next;
        }
        return ret.stream().mapToInt(Integer::intValue).toArray();
    }
}
