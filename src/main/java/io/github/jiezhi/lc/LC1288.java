package io.github.jiezhi.lc;

import java.util.Arrays;
import java.util.Comparator;

/**
 * CREATED AT: 2022/2/28
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Medium
 * <p>
 * SEE: https://leetcode.com/problems/remove-covered-intervals/discuss/451277/JavaC%2B%2BPython-Sort-Solution
 * <p>
 * DES:
 * <p>
 */
public class LC1288 {
    /**
     * Runtime: 11 ms, faster than 20.44%
     * Memory Usage: 47.2 MB, less than 14.96%
     * <p>
     * 1 <= intervals.length <= 1000
     * intervals[i].length == 2
     * 0 <= li <= ri <= 10^5
     * All the given intervals are unique.
     *
     * @param intervals
     * @return
     */
    public int removeCoveredIntervals(int[][] intervals) {
        int ret = 0, left = -1, right = -1;
        Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
        // Or sort like this:
        // Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        for (int[] interval : intervals) {
            if (interval[0] > left && interval[1] > right) {
                left = interval[0];
                ret++;
            }
            right = Math.max(right, interval[1]);
        }
        return ret;
    }
}
