package io.github.jiezhi.lc;

/**
 * CREATED AT: 2022/1/9
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Easy
 * <p>
 * SEE:
 * <p>
 * DES: https://leetcode-cn.com/problems/slowest-key/
 * <p>
 */
public class LC1629 {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.6 MB, 在所有 Java 提交中击败了26.03%的用户
     * 通过测试用例：109 / 109
     * <p>
     * releaseTimes.length == n
     * keysPressed.length == n
     * 2 <= n <= 1000
     * 1 <= releaseTimes[i] <= 109
     * releaseTimes[i] < releaseTimes[i+1]
     * keysPressed 仅由小写英文字母组成
     *
     * @param releaseTimes
     * @param keysPressed
     * @return
     */
    public char slowestKey(int[] releaseTimes, String keysPressed) {
        char ret = keysPressed.charAt(0);
        int maxTime = releaseTimes[0];
        int diff;
        for (int i = 1; i < releaseTimes.length; i++) {
            diff = releaseTimes[i] - releaseTimes[i - 1];
            if (diff > maxTime) {
                maxTime = diff;
                ret = keysPressed.charAt(i);
            } else if (diff == maxTime && keysPressed.charAt(i) > ret) {
                ret = keysPressed.charAt(i);
            }
        }
        return ret;
    }
}
