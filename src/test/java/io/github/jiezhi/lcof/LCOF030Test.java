package io.github.jiezhi.lcof;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * CREATED AT: 2021/10/19
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty:
 * <p>
 * SEE:
 * <p>
 * DES:
 * <p>
 */
public class LCOF030Test {
    @Test
    public void testLCOF30() {
        LCOF030.MinStack minStack = new LCOF030.MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-3);
        assertEquals(-3, minStack.min());
        minStack.pop();
        assertEquals(0, minStack.top());
        assertEquals(-2, minStack.min());

        LCOF030.MinStack minStack2 = new LCOF030.MinStack();
        minStack2.push(-1);
        assertEquals(-1, minStack2.top());
        assertEquals(-1, minStack2.min());

    }

}