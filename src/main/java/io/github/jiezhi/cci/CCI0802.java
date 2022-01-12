package io.github.jiezhi.cci;

import io.github.jiezhi.lcof.helper.ListNode;

import java.util.*;

/**
 * CREATED AT: 2022/1/12
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Medium
 * <p>
 * SEE:
 * <p>
 * DES: https://leetcode-cn.com/problems/robot-in-a-grid-lcci/
 * <p>
 */
public class CCI0802 {
    private int[][] obstacleGrid;
    private Set<List<Integer>> visited;
    private int r;
    private int c;

    /**
     * 执行用时：7 ms, 在所有 Java 提交中击败了11.19%的用户
     * 内存消耗：40.8 MB, 在所有 Java 提交中击败了5.22%的用户
     * 通过测试用例：46 / 46
     * <p>
     * r 和 c 的值均不超过 100。
     *
     * @param obstacleGrid
     * @return
     */
    public List<List<Integer>> pathWithObstacles(int[][] obstacleGrid) {
        if (obstacleGrid == null) return new ArrayList<>(1);
        r = obstacleGrid.length;
        c = obstacleGrid[0].length;
        visited = new HashSet<>();
        if (obstacleGrid[0][0] == 1 || obstacleGrid[r - 1][c - 1] == 1) return new ArrayList<>(1);

        this.obstacleGrid = obstacleGrid;

        List<List<Integer>> ret = new ArrayList<>(r + c - 1);
        return this.dfs(0, 0, ret);
    }

    private List<List<Integer>> dfs(int i, int j, List<List<Integer>> ret) {
        if (i >= r || j >= c || obstacleGrid[i][j] == 1 || visited.contains(Arrays.asList(i, j))) {
            return new ArrayList<>(1);
        }

        ret.add(Arrays.asList(i, j));
        visited.add(Arrays.asList(i, j));
        if (i == r - 1 && j == c - 1) {
            return ret;
        }
        List<List<Integer>> next = this.dfs(i, j + 1, ret);
        if (next.size() > 0) return next;

        next = this.dfs(i + 1, j, ret);
        if (next.size() > 0) return next;
        ret.remove(ret.size() - 1);
        visited.remove(Arrays.asList(i, j));
        return new ArrayList<>(1);

    }
}
