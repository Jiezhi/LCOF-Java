package io.github.jiezhi.lcci;

/**
 * CREATED AT: 2022/9/30
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Medium
 * <p>
 * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
 * 内存消耗：43.1 MB, 在所有 Java 提交中击败了47.89%的用户
 * 通过测试用例：159 / 159
 * <p>
 */
public class LCCI0108 {
    /**
     * @param matrix
     */
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        if (m == 0) return;
        int n = matrix[0].length;

        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }

        for (int i = 0; i < m; i++) {
            if (!row[i]) continue;
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 0;
            }
        }
        for (int j = 0; j < n; j++) {
            if (!col[j]) continue;
            for (int i = 0; i < m; i++) {
                matrix[i][j] = 0;
            }
        }
    }
}
