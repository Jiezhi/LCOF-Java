package io.github.jiezhi.lcof;

import org.junit.Test;

import static org.junit.Assert.*;

public class LCOF017Test {
    @Test
    public void test() {
        LCOF017 solution = new LCOF017();
        assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, solution.printNumbers(1));
    }
}