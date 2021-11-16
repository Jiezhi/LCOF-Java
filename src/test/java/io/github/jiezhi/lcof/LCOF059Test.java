package io.github.jiezhi.lcof;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LCOF059Test {
    @Test
    public void test() {
        LCOF059 solution = new LCOF059();
        assertArrayEquals(new int[]{3, 3, 5, 5, 6, 7}, solution.maxSlidingWindow(new int[]{1, 3, -1, -3, 5, 3, 6, 7}, 3));
        assertArrayEquals(new int[]{}, solution.maxSlidingWindow(new int[]{}, 0));
    }

}