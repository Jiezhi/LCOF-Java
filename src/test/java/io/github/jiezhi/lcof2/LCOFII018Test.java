package io.github.jiezhi.lcof2;

import org.junit.Test;

import static org.junit.Assert.*;

public class LCOFII018Test {
    @Test
    public void isPalindrome() {
        LCOFII018 solution = new LCOFII018();
        assertTrue(solution.isPalindrome(""));
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
        assertFalse(solution.isPalindrome("Arace a car"));
        assertFalse(solution.isPalindrome("\"OP\""));
    }
}