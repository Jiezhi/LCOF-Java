package io.github.jiezhi.lc;

/**
 * CREATED AT: 2022/3/16
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
public class LC278 {
    int badVersion;

    public LC278(int badVersion) {
        this.badVersion = badVersion;
    }

    /**
     * 执行用时：11 ms, 在所有 Java 提交中击败了99.95%的用户
     * 内存消耗：37.9 MB, 在所有 Java 提交中击败了47.64%的用户
     * 通过测试用例：22 / 22
     *
     * @param n 1 <= bad <= n <= 2^31 - 1
     * @return
     */
    public int firstBadVersion(int n) {
        int lo = 0, hi = n;
        int mid;
        while (lo < hi) {
            mid = lo + (hi - lo) / 2;
            if (isBadVersion(mid)) hi = mid;
            else lo = mid + 1;
        }
        return lo;
    }

    private boolean isBadVersion(int mid) {
        return mid >= badVersion;
    }
}
