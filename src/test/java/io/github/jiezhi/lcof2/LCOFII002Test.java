package io.github.jiezhi.lcof2;

import org.junit.Test;

import static org.junit.Assert.*;

public class LCOFII002Test {
    @Test
    public void test() {
        LCOFII002 solution = new LCOFII002();
        assertEquals("0", solution.addBinary("0", "0"));
        assertEquals("10", solution.addBinary("10", "0"));
        assertEquals("100", solution.addBinary("11", "1"));
        assertEquals("1", solution.addBinary("1", "0"));
        assertEquals("101", solution.addBinary("11", "10"));
        assertEquals("10101", solution.addBinary("1010", "1011"));
    }

}