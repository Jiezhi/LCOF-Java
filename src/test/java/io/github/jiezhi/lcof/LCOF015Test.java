package io.github.jiezhi.lcof;

import org.junit.Test;

import static org.junit.Assert.*;

public class LCOF015Test {
    @Test
    public void test() {
        LCOF015 solution = new LCOF015();
        assertEquals(3, solution.hammingWeight(11));
        assertEquals(1, solution.hammingWeight(128));
        assertEquals(31, solution.hammingWeight(-3));
    }

}