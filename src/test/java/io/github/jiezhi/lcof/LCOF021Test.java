package io.github.jiezhi.lcof;

import org.junit.Test;

import static org.junit.Assert.*;

public class LCOF021Test {
    @Test
    public void test() {
        LCOF021 solution = new LCOF021();
        int[] ret = solution.exchange(new int[]{1, 2, 3, 4});
        for (int i = 0; i < (ret.length / 2); i++) {
            assertEquals(1, ret[i] % 2);
        }
        for (int i = (ret.length / 2) + 1; i < ret.length; i++) {
            assertEquals(0, ret[i] % 2);
        }
    }

}