package io.github.jiezhi.lc;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC338Test {

    @Test
    public void countBits() {
        LC338 lc338 = new LC338();
        assertArrayEquals(new int[]{0, 1, 1}, lc338.countBits(2));
    }
}