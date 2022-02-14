package io.github.jiezhi.lc;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC1137Test {

    @Test
    public void tribonacci() {
        LC1137 solution = new LC1137();
        assertEquals(0, solution.tribonacci(0));
        assertEquals(615693474, solution.tribonacci(35));

    }
}