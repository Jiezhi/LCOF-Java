package io.github.jiezhi.cci;

import org.junit.Test;

import static org.junit.Assert.*;

public class CCI01Test {
    @Test
    public void isUnique() {
        CCI01 solution = new CCI01();
        assertFalse(solution.isUnique("leetcode"));
        assertTrue(solution.isUnique("abc"));
        assertTrue(solution.isUnique(""));
    }
}