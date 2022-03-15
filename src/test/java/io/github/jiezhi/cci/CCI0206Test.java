package io.github.jiezhi.cci;

import io.github.jiezhi.lcof.helper.ListNode;
import org.junit.Test;

import static org.junit.Assert.*;

public class CCI0206Test {

    @Test
    public void isPalindrome() {
        CCI0206 cci = new CCI0206();
        assertTrue(cci.isPalindrome(ListNode.build(new int[]{1, 2, 2, 1})));
        assertFalse(cci.isPalindrome(ListNode.build(new int[]{1, 2, 3, 2})));
    }
}