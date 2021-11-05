package io.github.jiezhi.lcof.helper;

import org.junit.Test;

import static org.junit.Assert.*;


public class TreeNodeTest {
    @Test
    public void test() {
        TreeNode node = TreeNode.build(new Integer[]{1, 2, 3, 4, 5, 6});
        assertEquals(1, node.val);
        assertEquals(2, node.left.val);
        assertEquals(3, node.right.val);

        TreeNode node2 = TreeNode.build(new Integer[]{3, 9, 20, null, null, 15, 7});
        assertNull(node2.left.left);
        assertEquals(15, node2.right.left.val);
        assertEquals(7, node2.right.right.val);
    }
}