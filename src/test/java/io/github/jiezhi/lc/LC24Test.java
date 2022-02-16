package io.github.jiezhi.lc;

import io.github.jiezhi.lcof.helper.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC24Test {

    @Test
    public void swapPairs() {
        LC24 solution = new LC24();
        assertEquals(ListNode.build(new int[]{1}), solution.swapPairs(ListNode.build(new int[]{1})));
        assertEquals(ListNode.build(new int[]{1, 2, 3, 4}), solution.swapPairs(ListNode.build(new int[]{2, 1, 4, 3})));
    }
}