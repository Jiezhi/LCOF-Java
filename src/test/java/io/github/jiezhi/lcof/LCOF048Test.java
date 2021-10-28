package io.github.jiezhi.lcof;

import org.junit.Test;

import static org.junit.Assert.*;

public class LCOF048Test {
    @Test
    public void test() {
        LCOF048 solution = new LCOF048();
        assertEquals(3, solution.lengthOfLongestSubstring("dvdf"));
        assertEquals(2, solution.lengthOfLongestSubstring("aab"));
        assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
        assertEquals(1, solution.lengthOfLongestSubstring("bbbbbb"));
        assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));
    }

}