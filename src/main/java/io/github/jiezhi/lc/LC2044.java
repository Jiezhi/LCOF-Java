package io.github.jiezhi.lc;

import java.util.ArrayList;
import java.util.List;

/**
 * CREATED AT: 2022/3/15
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty:
 * <p>
 * SEE:
 * <p>
 * DES:
 * <p>
 */
public class LC2044 {
    /**
     * 执行用时：71 ms, 在所有 Java 提交中击败了28.40%的用户
     * 内存消耗：46.7 MB, 在所有 Java 提交中击败了5.35%的用户
     * 通过测试用例：111 / 111
     *
     * @param nums 1 <= nums.length <= 16
     *             1 <= nums[i] <= 10^5
     * @return
     */
    public int countMaxOrSubsets(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<Integer> tmpList;
        for (int num : nums) {
            tmpList = new ArrayList(list);
            for (int value : tmpList) {
                list.add(num | value);
            }
            list.add(num);
        }

        list.sort((a, b) -> b - a);
        int max = list.get(0);
        int cnt = 0;
        for (int value : list) {
            if (value == max) cnt++;
            else break;
        }
        return cnt;
    }
}
