package io.github.jiezhi.lc;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC509Test {

    @Test
    public void fib() {
        LC509 solution = new LC509();
        assertEquals(0, solution.fib(0));
        assertEquals(1, solution.fib(1));
        assertEquals(832040, solution.fib(30));
    }
}