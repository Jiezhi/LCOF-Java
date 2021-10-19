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
 * Difficulty: Easy
 * <p>
 * SEE:
 * <p>
 * DES:
 * <p>
 */
public class LCOF009Test {

    @Test
    public void testLCOF009() {
        LCOF009.CQueue cQueue = new LCOF009.CQueue();
        cQueue.appendTail(3);
        assertEquals(3, cQueue.deleteHead());
        assertEquals(-1, cQueue.deleteHead());

        cQueue.appendTail(5);
        cQueue.appendTail(2);
        assertEquals(5, cQueue.deleteHead());
        assertEquals(2, cQueue.deleteHead());

    }

}