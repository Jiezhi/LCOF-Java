package io.github.jiezhi.lc;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC2044Test {

    @Test
    public void countMaxOrSubsets() {
        LC2044 lc = new LC2044();
        assertEquals(7, lc.countMaxOrSubsets(new int[]{2, 2, 2}));
        assertEquals(6, lc.countMaxOrSubsets(new int[]{3, 2, 1, 5}));
    }
}