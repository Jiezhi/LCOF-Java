package io.github.jiezhi.cci;

import org.junit.Test;

import static org.junit.Assert.*;

public class CCI0801Test {

    @Test
    public void waysToStep() {
        CCI0801 solution = new CCI0801();
//        assertEquals(4, solution.waysToStep(3));
//        assertEquals(13, solution.waysToStep(5));
        assertEquals(752119970, solution.waysToStep(61));
    }
}