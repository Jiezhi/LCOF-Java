package io.github.jiezhi.lcof2;

import org.junit.Test;

import static org.junit.Assert.*;


public class LCOFII001Test {
    @Test
    public void test() {
        LCOFII001 solution = new LCOFII001();
        assertEquals(7, solution.divide(15, 2));
        assertEquals(-2, solution.divide(7, -3));
        assertEquals(1, solution.divide(1, 1));
        assertEquals(Integer.MAX_VALUE, solution.divide(Integer.MIN_VALUE, -1));
    }
}