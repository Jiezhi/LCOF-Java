package io.github.jiezhi.cci;

import org.junit.Test;

import static org.junit.Assert.*;

public class CCI04Test {

    @Test
    public void canPermutePalindrome() {
        CCI04 solution = new CCI04();
        assertTrue(solution.canPermutePalindrome("tactcoa"));
        assertTrue(solution.canPermutePalindrome("tactcoao"));
        assertFalse(solution.canPermutePalindrome("tactcoat"));

    }
}