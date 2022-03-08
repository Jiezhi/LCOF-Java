package io.github.jiezhi.lc;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC217Test {

    @Test
    public void containsDuplicate() {
        LC217 lc = new LC217();
        assertTrue(lc.containsDuplicate(new int[]{1, 2, 3, 1}));
        assertFalse(lc.containsDuplicate(new int[]{1, 2, 3, 4}));

        assertTrue(lc.containsDuplicate2(new int[]{1, 2, 3, 1}));
        assertFalse(lc.containsDuplicate2(new int[]{1, 2, 3, 4}));
    }
}