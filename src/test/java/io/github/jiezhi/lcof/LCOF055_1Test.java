package io.github.jiezhi.lcof;

import io.github.jiezhi.lcof.helper.TreeNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class LCOF055_1Test {
    @Test
    public void test() {
        LCOF055_1 solution = new LCOF055_1();
        assertEquals(3, solution.maxDepth(TreeNode.build(new Integer[]{3, 9, 20, null, null, 15, 7})));
    }

}