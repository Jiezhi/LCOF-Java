package io.github.jiezhi.lc;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC70Test {

    @Test
    public void climbStairs() {
        LC70 solution = new LC70();
        assertEquals(5, solution.climbStairs(4));
        assertEquals(3, solution.climbStairs(3));
        assertEquals(1, solution.climbStairs(1));
    }
}