package io.github.jiezhi.lcof;

/**
 * CREATED AT: 2021/12/7
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Medium
 * <p>
 * SEE: 240
 * <p>
 * DES: 剑指 Offer 04. 二维数组中的查找
 * 在一个 n * m 的二维数组中，每一行都按照从左到右递增的顺序排序，每一列都按照从上到下递增的顺序排序。请完成一个高效的函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * <p>
 * <p>
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/er-wei-shu-zu-zhong-de-cha-zhao-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 */
public class LCOF004 {
    /**
     * 129 / 129 个通过测试用例
     * 状态：通过
     * 执行用时: 0 ms
     * 内存消耗: 44.2 MB
     * <p>
     * 0 <= n <= 1000
     * 0 <= m <= 1000
     *
     * @param matrix
     * @param target
     * @return
     */
    public boolean findNumberIn2DArray(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0) return false;
        int n = matrix[0].length;
        if (n == 0) return false;
        if (target < matrix[0][0] || target > matrix[m - 1][n - 1]) return false;
        for (int i = 0; i < m; i++) {
            if (target > matrix[i][n - 1] || target < matrix[i][0]) continue;
            // TODO j can be optimized!
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == target) return true;
            }
        }
        return false;
    }
}
