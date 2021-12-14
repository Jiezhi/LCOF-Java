package io.github.jiezhi.lcof2;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LCOFII006Test {

    @Test
    public void twoSum() {
        LCOFII006 solution = new LCOFII006();
        assertArrayEquals(new int[]{1, 3}, solution.twoSum(new int[]{1, 2, 4, 6, 10}, 8));
    }
}