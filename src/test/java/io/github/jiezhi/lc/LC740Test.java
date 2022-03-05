package io.github.jiezhi.lc;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC740Test {

    @Test
    public void deleteAndEarn() {
        LC740 lc = new LC740();
        assertEquals(10000, lc.deleteAndEarn(new int[]{10000}));
        assertEquals(9, lc.deleteAndEarn(new int[]{2, 2, 3, 3, 3, 4}));
    }
}