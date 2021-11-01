package io.github.jiezhi.lcof;

import io.github.jiezhi.lcof.helper.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;


public class LCOF022Test {
    @Test
    public void test() {
        LCOF022 solution = new LCOF022();
        assertEquals(ListNode.build(new int[]{4, 5}),
                solution.getKthFromEnd(ListNode.build(new int[]{1, 2, 3, 4, 5}), 2));
    }

}