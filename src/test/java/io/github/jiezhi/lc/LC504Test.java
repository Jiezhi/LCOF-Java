package io.github.jiezhi.lc;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC504Test {

    @Test
    public void convertToBase7() {
        LC504 lc = new LC504();
        assertEquals("202", lc.convertToBase7(100));
        assertEquals("-10", lc.convertToBase7(-7));
    }
}