package io.github.jiezhi.lc;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LC35Test {

    @Test
    public void searchInsert() {
        LC35 lc35 = new LC35();
        assertEquals(2, lc35.searchInsert(new int[]{1, 3, 5, 6}, 5));
        assertEquals(1, lc35.searchInsert(new int[]{1, 3, 5, 6}, 2));
    }
}