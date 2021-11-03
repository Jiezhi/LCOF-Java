package io.github.jiezhi.lcof;

import org.junit.Test;

import static org.junit.Assert.*;

public class LCOF053_2Test {
    @Test
    public void test() {
        LCOF053_2 solution = new LCOF053_2();
        assertEquals(0, solution.missingNumber(new int[]{1}));
        assertEquals(1, solution.missingNumber(new int[]{0, 2, 3}));
        assertEquals(2, solution.missingNumber(new int[]{0, 1, 3}));
        assertEquals(0, solution.missingNumber(new int[]{1, 2, 3}));
        assertEquals(3, solution.missingNumber(new int[]{0, 1, 2}));
        assertEquals(8, solution.missingNumber(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 9}));
    }

}