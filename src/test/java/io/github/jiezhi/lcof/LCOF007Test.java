package io.github.jiezhi.lcof;

import io.github.jiezhi.lcof.helper.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * CREATED AT: 2021/11/8
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty:
 * <p>
 * <p>
 */
public class LCOF007Test {
    @Test
    public void test() {
        LCOF007 lcof007 = new LCOF007();
        assertEquals(TreeNode.build(new Integer[]{3, 9, 20, null, null, 15, 7}), lcof007.buildTree(new int[]{3, 9, 20, 15, 7}, new int[]{9, 3, 15, 20, 7}));
        assertEquals(new TreeNode(-1), lcof007.buildTree(new int[]{-1}, new int[]{-1}));
    }

}