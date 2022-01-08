package io.github.jiezhi.cci;

import org.junit.Test;

import static org.junit.Assert.*;

public class CCI05Test {

    @Test
    public void oneEditAway() {
        CCI05 solution = new CCI05();
        assertFalse(solution.oneEditAway("mart", "karma"));
        assertTrue(solution.oneEditAway("pale", "ple"));
        assertTrue(solution.oneEditAway("pale", "pile"));
        assertFalse(solution.oneEditAway("pales", "ple"));
    }
}