package io.github.jiezhi.cci;

import org.junit.Test;

import static org.junit.Assert.*;

public class CCI0109Test {

    @Test
    public void isFlipedString() {
        CCI0109 solution = new CCI0109();
        assertTrue(solution.isFlipedString("waterbottle", "erbottlewat"));
        assertFalse(solution.isFlipedString("aab", "ab"));
    }
}