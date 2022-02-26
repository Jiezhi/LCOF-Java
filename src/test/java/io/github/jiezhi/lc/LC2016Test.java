package io.github.jiezhi.lc;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC2016Test {

    @Test
    public void maximumDifference() {
        LC2016 lc = new LC2016();
        assertEquals(1, lc.maximumDifference(new int[]{3, 1, 2}));
        assertEquals(4, lc.maximumDifference(new int[]{7, 1, 5, 4}));
    }
}