package io.github.jiezhi.lc;

import java.util.List;
import java.util.stream.Collectors;

/**
 * CREATED AT: 2022/3/7
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
public class LC2193 {
    /**
     * 执行用时：22 ms, 在所有 Java 提交中击败了27.33%的用户
     * 内存消耗：41.1 MB, 在所有 Java 提交中击败了37.33%的用户
     * 通过测试用例：129 / 129
     *
     * @param s 1 <= s.length <= 2000
     *          s 只包含小写英文字母。
     *          s 可以通过有限次操作得到一个回文串。
     * @return
     */
    public int minMovesToMakePalindrome(String s) {
        // 先把字符串转换成列表
        // 方法一
//        List<Character> list = new ArrayList<>(s.length());
//        for (char c : s.toCharArray()) {
//            list.add(c);
//        }
        // 方法二
        List<Character> list = s.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
        int len;
        int pos;
        int ret = 0;
        while (!list.isEmpty()) {
            len = list.size();
            pos = list.indexOf(list.get(len - 1));
            if (pos == len - 1) {
                ret += pos / 2;
                list.remove(len - 1);
            } else {
                ret += pos;
                list.remove(len - 1);
                list.remove(pos);
            }
        }

        return ret;

    }
}
