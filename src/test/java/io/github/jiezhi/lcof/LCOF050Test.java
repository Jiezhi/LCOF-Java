package io.github.jiezhi.lcof;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * CREATED AT: 2021/12/6
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty:
 * <p>
 * <p>
 */
public class LCOF050Test {
    @Test
    public void test() {
        LCOF050 solution = new LCOF050();
        assertEquals('b', solution.firstUniqChar("abaccdeff"));
        assertEquals(' ', solution.firstUniqChar(""));
    }

}