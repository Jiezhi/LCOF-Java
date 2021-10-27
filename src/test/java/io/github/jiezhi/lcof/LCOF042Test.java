package io.github.jiezhi.lcof;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * CREATED AT: 2021/10/27
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty:
 * <p>
 * SEE:
 * <p>
 * DES:
 * <p>
 */
public class LCOF042Test {

    @Test
    public void test() {
        LCOF042 solution = new LCOF042();
        assertEquals(6, solution.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));

        assertEquals(-1, solution.maxSubArray(new int[]{-1}));
        assertEquals(-1, solution.maxSubArray(new int[]{-1, -2}));
    }

}