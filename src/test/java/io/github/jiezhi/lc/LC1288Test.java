package io.github.jiezhi.lc;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC1288Test {

    @Test
    public void removeCoveredIntervals() {
        LC1288 lc = new LC1288();
        assertEquals(2, lc.removeCoveredIntervals(new int[][]{{1, 4}, {3, 6}, {2, 8}}));
        assertEquals(1, lc.removeCoveredIntervals(new int[][]{{1, 4}, {2, 3}}));
    }
}