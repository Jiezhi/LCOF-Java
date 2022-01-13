package io.github.jiezhi.lc;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC747Test {

    @Test
    public void dominantIndex() {
        LC747 solution = new LC747();
        assertEquals(1, solution.dominantIndex(new int[]{3, 6, 1, 0}));
        assertEquals(-1, solution.dominantIndex(new int[]{1, 2, 3, 4}));
        assertEquals(0, solution.dominantIndex(new int[]{1}));
    }
}