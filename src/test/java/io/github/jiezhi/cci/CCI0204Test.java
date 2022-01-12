package io.github.jiezhi.cci;

import io.github.jiezhi.lcof.helper.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class CCI0204Test {

    @Test
    public void partition() {
        CCI0204 solution = new CCI0204();
        assertEquals(ListNode.build(new int[]{1, 2}), solution.partition(ListNode.build(new int[]{2, 1}), 2));
    }
}