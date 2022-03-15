package io.github.jiezhi.lc;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

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
public class LC1249 {
    /**
     * 执行用时：11 ms, 在所有 Java 提交中击败了88.71%的用户
     * 内存消耗：42.2 MB, 在所有 Java 提交中击败了19.53%的用户
     * 通过测试用例：62 / 62
     *
     * @param s 1 <= s.length <= 10^5
     *          s[i] is either'(' , ')', or lowercase English letter.
     * @return
     */
    public String minRemoveToMakeValid(String s) {
        char[] arr = s.toCharArray();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == '(') {
                stack.push(i);
            } else if (arr[i] == ')') {
                if (stack.isEmpty()) {
                    arr[i] = ' ';
                } else {
                    stack.pop();
                }
            }
        }

        while (!stack.isEmpty()) {
            arr[stack.pop()] = ' ';
        }
        return new String(arr).replace(" ", "");
    }
}
