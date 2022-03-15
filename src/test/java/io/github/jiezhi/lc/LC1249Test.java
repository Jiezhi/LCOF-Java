package io.github.jiezhi.lc;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC1249Test {

    @Test
    public void minRemoveToMakeValid() {
        LC1249 lc = new LC1249();
        assertEquals("lee(t(c)o)de", lc.minRemoveToMakeValid("lee(t(c)o)de)"));
        assertEquals("", lc.minRemoveToMakeValid("))(("));
    }
}