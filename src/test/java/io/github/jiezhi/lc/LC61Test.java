package io.github.jiezhi.lc;

import io.github.jiezhi.lcof.helper.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC61Test {

    @Test
    public void rotateRight() {
        LC61 lc61 = new LC61();
        assertEquals(lc61.rotateRight(ListNode.build(new int[]{1, 2, 3, 4, 5}), 2), ListNode.build(new int[]{4, 5, 1, 2, 3}));
    }
}