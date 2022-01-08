package io.github.jiezhi.cci;

import org.junit.Test;

import static org.junit.Assert.*;

public class CCI06Test {

    @Test
    public void compressString() {
        CCI06 solution = new CCI06();
        assertEquals("a2b1c5a3", solution.compressString("aabcccccaaa"));
        assertEquals("abbccd", solution.compressString("abbccd"));
        assertEquals("aa", solution.compressString("aa"));
        assertEquals("a", solution.compressString("a"));
        assertEquals("a3", solution.compressString("aaa"));
    }
}