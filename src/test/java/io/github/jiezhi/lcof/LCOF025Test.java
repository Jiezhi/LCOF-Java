package io.github.jiezhi.lcof;

import io.github.jiezhi.lcof.helper.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class LCOF025Test {
    @Test
    public void test() {
        LCOF025 solution = new LCOF025();
        assertEquals(ListNode.build(new int[]{1, 1, 2, 3, 4, 4}), solution.mergeTwoLists(
                ListNode.build(new int[]{1, 2, 4}),
                ListNode.build(new int[]{1, 3, 4})
        ));

        assertEquals(ListNode.build(new int[]{1, 2, 3}), solution.mergeTwoLists(
                ListNode.build(new int[]{1, 2, 3}),
                ListNode.build(new int[]{})
        ));
    }

}