package io.github.jiezhi.cci;

import io.github.jiezhi.lcof.helper.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class CCI0201Test {

    @Test
    public void removeDuplicateNodes() {
        CCI0201 solution = new CCI0201();
        assertEquals(ListNode.build(new int[]{1, 2, 3}), solution.removeDuplicateNodes(ListNode.build(new int[]{1, 2, 3, 3, 2, 1})));
        assertEquals(ListNode.build(new int[]{}), solution.removeDuplicateNodes(ListNode.build(new int[]{})));
        assertEquals(ListNode.build(new int[]{1, 2}), solution.removeDuplicateNodes(ListNode.build(new int[]{1, 1, 1, 1, 2})));
    }
}