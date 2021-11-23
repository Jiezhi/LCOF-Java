package io.github.jiezhi.lcof;

import io.github.jiezhi.lcof.helper.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LCOF026Test {

    @Test
    public void isSubStructure() {
        LCOF026 solution = new LCOF026();
        assertFalse(solution.isSubStructure(
                TreeNode.build(new Integer[]{1, 2, 3}),
                TreeNode.build(new Integer[]{3, 1})
        ));
        assertTrue(solution.isSubStructure(
                TreeNode.build(new Integer[]{3, 4, 5, 1, 2}),
                TreeNode.build(new Integer[]{4, 1})
        ));
        assertFalse(solution.isSubStructure(
                TreeNode.build(new Integer[]{3, 4, 5, 1, 2}),
                TreeNode.build(new Integer[]{})
        ));
    }
}