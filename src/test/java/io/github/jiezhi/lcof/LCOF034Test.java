package io.github.jiezhi.lcof;

import io.github.jiezhi.lcof.helper.ListNode;
import io.github.jiezhi.lcof.helper.TreeNode;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class LCOF034Test {
    @Test
    public void test() {
        LCOF034 solution = new LCOF034();
//        int[] ret = solution.pathSum(TreeNode.build(new int[]{5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1}), 22);
        List<Integer> ans = new ArrayList<>();
        ans.add(1);
        ans.add(2);
        ans.add(4);
        List<List<Integer>> anss = new ArrayList<>();
        anss.add(ans);
        assertEquals(anss, solution.pathSum(TreeNode.build(new Integer[]{1, 2, 3, 4, 5, 6}), 7));
    }

}