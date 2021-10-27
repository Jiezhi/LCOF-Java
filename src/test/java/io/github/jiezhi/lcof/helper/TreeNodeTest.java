package io.github.jiezhi.lcof.helper;

import org.junit.Test;

import static org.junit.Assert.*;


public class TreeNodeTest {
    @Test
    public void test() {
        TreeNode node = TreeNode.build(new int[]{1, 2, 3, 4, 5, 6});
        assertEquals(1, node.val);
        assertEquals(2, node.left.val);
        assertEquals(3, node.right.val);
    }
}