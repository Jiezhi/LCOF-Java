package io.github.jiezhi.lc;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC334Test {

    @Test
    public void increasingTriplet() {
        LC334 solution = new LC334();
        assertTrue(solution.increasingTriplet(new int[]{20, 100, 10, 12, 5, 13}));
        assertTrue(solution.increasingTriplet(new int[]{1, 2, 3, 4, 5}));
        assertTrue(solution.increasingTriplet(new int[]{2, 1, 5, 0, 4, 6}));
        assertFalse(solution.increasingTriplet(new int[]{5, 4, 3, 2, 1}));
    }
}