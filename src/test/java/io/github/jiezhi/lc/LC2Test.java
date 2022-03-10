package io.github.jiezhi.lc;

import io.github.jiezhi.lcof.helper.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC2Test {

    @Test
    public void addTwoNumbers() {
        LC2 lc2 = new LC2();
        assertEquals(ListNode.build(new int[]{7, 0, 8}), lc2.addTwoNumbers(ListNode.build(new int[]{2, 4, 3}), ListNode.build(new int[]{5, 6, 4})));
    }
}