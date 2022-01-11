package io.github.jiezhi.cci;

import io.github.jiezhi.lcof.helper.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class CCI0202Test {

    @Test
    public void kthToLast() {
        CCI0202 solution = new CCI0202();
        assertEquals(4, solution.kthToLast(ListNode.build(new int[]{1, 2, 3, 4, 5}), 2));
        assertEquals(1, solution.kthToLast(ListNode.build(new int[]{1, 2, 3, 4, 5}), 5));
    }
}