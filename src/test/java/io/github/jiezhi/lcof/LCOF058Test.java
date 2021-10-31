package io.github.jiezhi.lcof;

import org.junit.Test;

import static org.junit.Assert.*;

public class LCOF058Test {
    @Test
    public void test() {
        LCOF058 solution = new LCOF058();
        assertEquals("blue is sky the", solution.reverseWords("the sky is blue"));
        assertEquals("world! hello", solution.reverseWords("  hello world!  "));
        assertEquals("world! hello", solution.reverseWords("  hello      world!  "));
    }
}