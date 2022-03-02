package io.github.jiezhi.lc;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC392Test {

    @Test
    public void isSubsequence() {
        LC392 lc = new LC392();
        assertTrue(lc.isSubsequence("abc", "ahbgdc"));
        assertFalse(lc.isSubsequence("axc", "ahbgdc"));
    }
}