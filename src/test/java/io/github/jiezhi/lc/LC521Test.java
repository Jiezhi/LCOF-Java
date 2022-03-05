package io.github.jiezhi.lc;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC521Test {

    @Test
    public void findLUSLength() {
        LC521 lc521 = new LC521();
        assertEquals(3, lc521.findLUSLength("aba", "cdc"));
    }
}