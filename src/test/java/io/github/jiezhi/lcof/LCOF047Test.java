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
public class LCOF047Test {
    @Test
    public void test() {
        LCOF047 solution = new LCOF047();
        assertEquals(12, solution.maxValue(
                new int[][]{
                        {1, 3, 1},
                        {1, 5, 1},
                        {4, 2, 1}}
        ));
    }

}