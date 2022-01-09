package io.github.jiezhi.lc;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC1629Test {

    @Test
    public void slowestKey() {
        LC1629 solution = new LC1629();
        assertEquals('c', solution.slowestKey(
                new int[]{9, 29, 49, 50}, "cbcd"));
        assertEquals('a', solution.slowestKey(
                new int[]{12, 23, 36, 46, 62}, "spuda"));
    }
}