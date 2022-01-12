package io.github.jiezhi.cci;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

public class CCI0802Test {

    @Test
    public void pathWithObstacles() {
        CCI0802 solution = new CCI0802();
        System.out.println(solution.pathWithObstacles(new int[][]{
                {1},
        }));
        System.out.println(solution.pathWithObstacles(new int[][]{
                {0, 0, 0},
                {0, 1, 0},
                {0, 0, 0},
        }));
        System.out.println(solution.pathWithObstacles(new int[][]{
                {0, 0, 1},
                {0, 1, 0},
                {0, 0, 0},
        }));
        System.out.println(solution.pathWithObstacles(new int[][]{
                {0, 0, 1},
                {0, 1, 0},
                {1, 0, 0},
        }));
    }
}