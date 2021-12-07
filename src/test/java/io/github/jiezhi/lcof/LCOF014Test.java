package io.github.jiezhi.lcof;

import org.junit.Test;

import static org.junit.Assert.*;

public class LCOF014Test {

    @Test
    public void test() {
        LCOF014 solution = new LCOF014();
        assertEquals(1, solution.cuttingRope(2));
        assertEquals(36, solution.cuttingRope(10));
    }
}