package io.github.jiezhi.lcof;

import org.junit.Test;

import java.util.stream.IntStream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class LCOF003Test {
    @Test
    public void findRepeatNumber() {
        LCOF003 solution = new LCOF003();
        int ret = solution.findRepeatNumber(new int[]{2, 3, 1, 0, 2, 5, 3});
        assertTrue(IntStream.of(2, 3).anyMatch(x -> x == ret));

        int ret2 = solution.findRepeatNumber(new int[]{0, 0, 0});
        assertEquals(0, ret2);

        assertEquals(1, solution.findRepeatNumber(new int[]{1, 1, 1}));
    }

}
