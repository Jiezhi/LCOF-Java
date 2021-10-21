package io.github.jiezhi.lcof;

import io.github.jiezhi.lcof.helper.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * CREATED AT: 2021/10/21
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
public class LCOF024Test {
    @Test
    public void reverseListTest() {
        LCOF024 solution = new LCOF024();
        ListNode listNode = ListNode.build(new int[]{1, 2, 3, 4, 5});
        assertEquals(solution.reverseList(listNode), ListNode.build(new int[]{5, 4, 3, 2, 1}));
        assertEquals(solution.reverseList(ListNode.build(new int[]{1})), ListNode.build(new int[]{1}));
        assertEquals(solution.reverseList(ListNode.build(new int[]{1, 2})), ListNode.build(new int[]{2, 1}));

        assertEquals(solution.reverseList(ListNode.build(null)), ListNode.build(null));
    }
}