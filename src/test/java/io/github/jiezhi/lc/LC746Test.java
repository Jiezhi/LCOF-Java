package io.github.jiezhi.lc;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC746Test {

    @Test
    public void minCostClimbingStairs() {
        LC746 lc = new LC746();
        assertEquals(15, lc.minCostClimbingStairs(new int[]{10, 15, 20}));
        assertEquals(6, lc.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
        assertEquals(1, lc.minCostClimbingStairs(new int[]{1, 100}));
    }
}