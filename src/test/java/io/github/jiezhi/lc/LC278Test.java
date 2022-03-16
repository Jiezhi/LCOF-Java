package io.github.jiezhi.lc;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC278Test {

    @Test
    public void firstBadVersion() {
        assertEquals(5, new LC278(5).firstBadVersion(5));
        assertEquals(1, new LC278(1).firstBadVersion(5));
        assertEquals(1, new LC278(1).firstBadVersion(1));
    }
}