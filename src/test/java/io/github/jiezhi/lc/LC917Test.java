package io.github.jiezhi.lc;

import org.junit.Test;

import static org.junit.Assert.*;

public class LC917Test {

    @Test
    public void reverseOnlyLetters() {
        LC917 lc = new LC917();
        assertEquals("ab-cd", lc.reverseOnlyLetters("dc-ba"));
        assertEquals("Qedo1ct-eeLg=ntse-T!", lc.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }
}