package io.github.jiezhi.lcof;

import io.github.jiezhi.lcof.helper.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class LCOF018Test {
    @Test
    public void test() {
        LCOF018 solution = new LCOF018();
        assertEquals(ListNode.build(new int[]{4, 1, 9}), solution.deleteNode(ListNode.build(new int[]{4, 5, 1, 9}), 5));
        assertEquals(ListNode.build(new int[]{5, 1, 9}), solution.deleteNode(ListNode.build(new int[]{4, 5, 1, 9}), 4));
        assertEquals(ListNode.build(new int[]{4, 5, 1}), solution.deleteNode(ListNode.build(new int[]{4, 5, 1, 9}), 9));
        assertEquals(ListNode.build(new int[]{}), solution.deleteNode(ListNode.build(new int[]{4}), 4));
    }

}