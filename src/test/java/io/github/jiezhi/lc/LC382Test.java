package io.github.jiezhi.lc;

import com.sun.tools.javac.util.ArrayUtils;
import io.github.jiezhi.lcof.helper.ListNode;
import org.junit.Test;

import java.util.Arrays;
import java.util.stream.IntStream;

import static org.junit.Assert.*;

public class LC382Test {


    @Test
    public void getRandom() {
        int[] nums = new int[]{1, 2, 3};
        ListNode ln = ListNode.build(nums);
        LC382 solution = new LC382(ln);
        for (int i = 0; i < 100000; i++) {
            final int ret = solution.getRandom();
            assertTrue(IntStream.of(nums).anyMatch(x -> x == ret));

        }
    }
}