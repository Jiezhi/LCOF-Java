package io.github.jiezhi.lc;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC169Test {

    @Test
    public void majorityElement() {
        LC169 lc = new LC169();
        assertEquals(2, lc.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2}));
        assertEquals(2, lc.majorityElement2(new int[]{2, 2, 1, 1, 1, 2, 2}));
    }
}