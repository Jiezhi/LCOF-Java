package io.github.jiezhi.lcof;

import org.junit.Test;

import static org.junit.Assert.*;


public class LCOF058_2Test {
    @Test
    public void test() {
        LCOF058_2 solution = new LCOF058_2();
        assertEquals("cdefgab", solution.reverseLeftWords("abcdefg", 2));
        assertEquals("umghlrlose", solution.reverseLeftWords("lrloseumgh", 6));
    }

}