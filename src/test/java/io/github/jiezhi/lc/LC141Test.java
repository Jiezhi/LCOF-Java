package io.github.jiezhi.lc;

import io.github.jiezhi.lcof.helper.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class LC141Test {

    @Test
    public void hasCycle() {
        LC141 lc141 = new LC141();
        assertFalse(lc141.hasCycle(null));
        assertFalse(lc141.hasCycle(new ListNode(1)));
    }
}