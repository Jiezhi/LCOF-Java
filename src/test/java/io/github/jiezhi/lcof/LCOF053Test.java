package io.github.jiezhi.lcof;

import org.junit.Test;

import static org.junit.Assert.*;

public class LCOF053Test {
    @Test
    public void test() {
        LCOF053 solution = new LCOF053();
        assertEquals(2, solution.search(new int[]{5, 7, 7, 8, 8, 10}, 8));
        assertEquals(0, solution.search(new int[]{5, 7, 7, 8, 8, 10}, 6));
    }

}