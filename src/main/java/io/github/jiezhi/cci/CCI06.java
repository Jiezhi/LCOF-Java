package io.github.jiezhi.cci;

/**
 * CREATED AT: 2022/1/8
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Easy
 * <p>
 * SEE:
 * <p>
 * DES: https://leetcode-cn.com/problems/compress-string-lcci/
 * <p>
 */
public class CCI06 {
    /**
     * 执行用时：4 ms, 在所有 Java 提交中击败了77.67%的用户
     * 内存消耗：38.4 MB, 在所有 Java 提交中击败了22.03%的用户
     * 通过测试用例：32 / 32
     * <p>
     * 你可以假设字符串中只包含大小写英文字母（a至z）。
     *
     * @param S 字符串长度在[0, 50000]范围内。
     * @return
     */
    public String compressString(String S) {
        if (S == null || S.length() == 0) return S;
        StringBuilder sb = new StringBuilder();
        char tmpChar = S.charAt(0);
        int i = 1;
        int cnt = 1;
        while (i < S.length()) {
            if (S.charAt(i) == tmpChar) {
                cnt++;
            } else {
                sb.append(tmpChar);
                sb.append(cnt);

                tmpChar = S.charAt(i);
                cnt = 1;
            }
            i++;
        }
        sb.append(tmpChar);
        sb.append(cnt);
        if (sb.toString().length() < S.length()) {
            return sb.toString();
        } else {
            return S;
        }

    }
}
