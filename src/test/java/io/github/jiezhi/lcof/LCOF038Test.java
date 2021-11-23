package io.github.jiezhi.lcof;

import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class LCOF038Test {

    @Test
    public void permutation() {
        LCOF038 solution = new LCOF038();
        System.out.println(Arrays.toString(solution.permutation("")));
        System.out.println(Arrays.toString(solution.permutation("a")));
        System.out.println(Arrays.toString(solution.permutation("aa")));
        System.out.println(Arrays.toString(solution.permutation("abc")));
        System.out.println(Arrays.toString(solution.permutation("abcc")));
    }
}