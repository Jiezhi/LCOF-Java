package io.github.jiezhi.lc;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC53Test {

    @Test
    public void maxSubArray() {
        LC53 lc = new LC53();
        assertEquals(6, lc.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
    }
}