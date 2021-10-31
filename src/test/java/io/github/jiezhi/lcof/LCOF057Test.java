package io.github.jiezhi.lcof;

import org.junit.Test;

import static org.junit.Assert.*;

public class LCOF057Test {
    @Test
    public void test() {
        LCOF057 solution = new LCOF057();
        int[] ret = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        assertEquals(2, ret.length);
        assertEquals(9, ret[0] + ret[1]);
    }

}