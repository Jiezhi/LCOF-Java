package io.github.jiezhi.lc;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC1614Test {

    @Test
    public void maxDepth() {
        LC1614 solution = new LC1614();
        assertEquals(3, solution.maxDepth("(1+(2*3)+((8)/4))+1"));
        assertEquals(3, solution.maxDepth("(1)+((2))+(((3)))"));
        assertEquals(1, solution.maxDepth("1+(2*3)/(2-1)"));
    }
}