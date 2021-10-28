package io.github.jiezhi.lcof;

import org.junit.Test;

import static org.junit.Assert.*;

public class LCOF046Test {
    @Test
    public void test() {
        LCOF046 solution = new LCOF046();
        assertEquals(1, solution.translateNum(1));
        assertEquals(1, solution.translateNum(26));
        assertEquals(2, solution.translateNum(126));
        assertEquals(3, solution.translateNum(12268));
        assertEquals(5, solution.translateNum(12258));
        assertEquals(10, solution.translateNum(122512));
    }

}