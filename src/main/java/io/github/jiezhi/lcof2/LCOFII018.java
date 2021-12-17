package io.github.jiezhi.lcof2;

/**
 * CREATED AT: 2021/12/17
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty:
 * <p>
 * SEE: 125
 * <p>
 * DES: 剑指 Offer II 018. 有效的回文
 * 给定一个字符串 s ，验证 s 是否是 回文串 ，只考虑字母和数字字符，可以忽略字母的大小写。
 * <p>
 * 本题中，将空字符串定义为有效的 回文串 。
 * <p>
 */
public class LCOFII018 {
    /**
     * 1 <= s.length <= 2 * 10^5
     * 字符串 s 由 ASCII 字符组成
     *
     * @param s
     * @return
     */
    public boolean isPalindrome(String s) {
        if (s.length() == 0) return true;
        int low = 0;
        int high = s.length() - 1;
        while (low < high) {
            while (low < high && !Character.isLetterOrDigit(s.charAt(low))) low++;
            while (low < high && !Character.isLetterOrDigit(s.charAt(high))) high--;
            if (low < high && Character.toLowerCase(s.charAt(low)) != Character.toLowerCase(s.charAt(high)))
                return false;
            low++;
            high--;
        }
        return true;
    }
}
