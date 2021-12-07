package io.github.jiezhi.lcof;

import org.junit.Test;

import static org.junit.Assert.*;

public class LCOF004Test {

    @Test
    public void test() {
        LCOF004 solution = new LCOF004();
        int[][] matrix = new int[][]{
                {1, 4, 7, 11, 15},
                {2, 5, 8, 12, 19},
                {3, 6, 9, 16, 22},
                {10, 13, 14, 17, 24},
                {18, 21, 23, 26, 30}
        };

        assertTrue(solution.findNumberIn2DArray(matrix, 5));
        assertFalse(solution.findNumberIn2DArray(matrix, 20));
    }
}