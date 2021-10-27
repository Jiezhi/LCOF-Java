package io.github.jiezhi.lcof;

import io.github.jiezhi.lcof.helper.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * CREATED AT: 2021/10/27
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty:
 * <p>
 * SEE:
 * <p>
 * DES:
 * <p>
 */
public class LCOF027Test {
    @Test
    public void test() {
        LCOF027 solution = new LCOF027();
        assertEquals(TreeNode.build(new int[]{4, 2, 7, 1, 3, 6, 9}), solution.mirrorTree(TreeNode.build(new int[]{4, 7, 2, 9, 6, 3, 1})));
    }

}