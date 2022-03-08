package io.github.jiezhi.lc;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC2193Test {

    @Test
    public void minMovesToMakePalindrome() {
        LC2193 lc2193 = new LC2193();
        assertEquals(2, lc2193.minMovesToMakePalindrome("aabb"));
        assertEquals(163, lc2193.minMovesToMakePalindrome("skwhhaaunskegmdtutlgtteunmuuludii"));
    }
}