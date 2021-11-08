package io.github.jiezhi.lcof;

import org.junit.Test;

import static org.junit.Assert.*;

public class LCOF065Test {
    @Test
    public void test() {
        LCOF065 solution = new LCOF065();
        assertEquals(3, solution.add(1, 2));
        assertEquals(3, solution.add(0, 3));
        assertEquals(3, solution.add(-5, 8));
        assertEquals(0, solution.add(-1, 1));
    }

}