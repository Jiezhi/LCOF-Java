package io.github.jiezhi.lcci;

import junit.framework.TestCase;

import static org.junit.Assert.assertArrayEquals;

/**
 * CREATED AT: 2022/9/30
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty:
 * <p>
 * <p>
 */
public class LCCI0108Test extends TestCase {

    public void testSetZeroes() {
        int[][] matrix = new int[][]{{1, 1, 1}, {1, 0, 1}, {1, 1, 1}};
        LCCI0108 solution = new LCCI0108();
        solution.setZeroes(matrix);
        assertArrayEquals(new int[][]{{1, 0, 1}, {0, 0, 0}, {1, 0, 1}}, matrix);
    }
}