package io.github.jiezhi.lc;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC680Test {

    @Test
    public void validPalindrome() {
        LC680 lc = new LC680();
        assertTrue(lc.validPalindrome("aba"));
        assertFalse(lc.validPalindrome("abc"));
    }
}