package io.github.jiezhi.cci;

import org.junit.Test;

import static org.junit.Assert.*;

public class CCI0302Test {

    @Test
    public void test() {
        CCI0302 cci0302 = new CCI0302();
        cci0302.push(-2);
        cci0302.push(0);
        cci0302.push(-3);

        assertEquals(-3, cci0302.getMin());
        cci0302.pop();
        assertEquals(0, cci0302.top());
        assertEquals(-2, cci0302.getMin());
    }
}