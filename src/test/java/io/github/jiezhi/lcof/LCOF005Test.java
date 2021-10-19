package io.github.jiezhi.lcof;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * CREATED AT: 2021/10/19
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty:
 * <p>
 * <p>
 */
public class LCOF005Test {
    @Test
    public void replaceSpaceTest() {
        assertEquals("We%20are%20happy.", new LCOF005().replaceSpace("We are happy."));
        assertEquals("", new LCOF005().replaceSpace(""));
    }

}