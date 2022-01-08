package io.github.jiezhi.cci;

import org.junit.Test;

import static org.junit.Assert.*;

public class CCI02Test {

    @Test
    public void checkPermutation() {
        CCI02 solution = new CCI02();
        assertTrue(solution.checkPermutation("abc", "bca"));
        assertFalse(solution.checkPermutation("abc", "bad"));
        assertTrue(solution.checkPermutation("asvnpzurz", "urzsapzvn"));
    }
}