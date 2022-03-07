package io.github.jiezhi.lc;

/**
 * CREATED AT: 2022/3/7
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Easy
 * <p>
 * SEE:
 * <p>
 * DES:
 * <p>
 */
public class LC504 {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：38.7 MB, 在所有 Java 提交中击败了30.25%的用户
     * 通过测试用例：241 / 241
     *
     * @param num -10^7 <= num <= 10^7
     * @return
     */
    public String convertToBase7(int num) {
        if (num == 0) return "0";
        boolean neg = false;
        if (num < 0) {
            neg = true;
            num = -num;
        }
        StringBuilder sb = new StringBuilder();
        while (num != 0) {
            sb.append(num % 7);
            num /= 7;
        }
        if (neg) {
            sb.append("-");
        }
        return sb.reverse().toString();

    }
}
