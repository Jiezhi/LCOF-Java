package io.github.jiezhi.lcof;

import org.junit.Test;

import static org.junit.Assert.*;

public class LCOF059_2Test {

    @Test
    public void test() {
        LCOF059_2.MaxQueue solution = new LCOF059_2.MaxQueue();
        solution.push_back(1);
        solution.push_back(2);
        assertEquals(2, solution.max_value());
        assertEquals(1, solution.pop_front());
        assertEquals(2, solution.max_value());

        solution = new LCOF059_2.MaxQueue();
        assertEquals(-1, solution.pop_front());
        assertEquals(-1, solution.max_value());

        solution = new LCOF059_2.MaxQueue();
        solution.push_back(3);
        assertEquals(3, solution.max_value());
        solution.push_back(1);
        assertEquals(3, solution.max_value());
        assertEquals(3, solution.pop_front());
        assertEquals(1, solution.max_value());

        solution.push_back(5);
        assertEquals(5, solution.max_value());
        assertEquals(1, solution.pop_front());
        assertEquals(5, solution.pop_front());
        assertEquals(-1, solution.max_value());
        assertEquals(-1, solution.pop_front());

    }
}