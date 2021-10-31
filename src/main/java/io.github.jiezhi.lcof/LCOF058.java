package io.github.jiezhi.lcof;

/**
 * CREATED AT: 2021/10/31
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Easy
 * <p>
 * SEE: 151 https://leetcode-cn.com/problems/reverse-words-in-a-string/
 * <p>
 * DES: 剑指 Offer 58 - I. 翻转单词顺序
 * <p>
 * 输入一个英文句子，翻转句子中单词的顺序，但单词内字符的顺序不变。为简单起见，标点符号和普通字母一样处理。例如输入字符串"I am a student. "，则输出"student. a am I"。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/fan-zhuan-dan-ci-shun-xu-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 */
public class LCOF058 {
    /**
     * 25 / 25 个通过测试用例
     * 状态：通过
     * 执行用时: 6 ms
     * 内存消耗: 38.4 MB
     * <p>
     * <p>
     * 无空格字符构成一个单词。
     * 输入字符串可以在前面或者后面包含多余的空格，但是反转后的字符不能包括。
     * 如果两个单词间有多余的空格，将反转后单词间的空格减少到只含一个。
     * <p>
     *
     * @param s
     * @return
     */
    public String reverseWords(String s) {
        if (s.length() == 0) {
            return s;
        }
        String[] splits = s.split("\\s+");
        int l = 0;
        int h = splits.length - 1;
        String tmp;
        while (l < h) {
            while (l < h && splits[l].equals("")) l++;
            while (l < h && splits[h].equals("")) h--;
            if (l < h) {
                tmp = splits[l];
                splits[l] = splits[h];
                splits[h] = tmp;
                l++;
                h--;
            }
        }
        return String.join(" ", splits).trim();
    }
}
