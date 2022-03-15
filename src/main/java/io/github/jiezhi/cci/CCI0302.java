package io.github.jiezhi.cci;

import java.util.Stack;

/**
 * CREATED AT: 2022/3/15
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
 * 执行用时：13 ms, 在所有 Java 提交中击败了84.53%的用户
 * 内存消耗：42.9 MB, 在所有 Java 提交中击败了39.99%的用户
 * 通过测试用例：18 / 18
 */
public class CCI0302 {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minS = new Stack<>();

    /**
     * initialize your data structure here.
     */
    public CCI0302() {

    }

    public void push(int x) {
        stack.push(x);
        if (minS.isEmpty() || x <= minS.peek()) {
            minS.push(x);
        } else {
            minS.push(minS.peek());
        }
    }

    public void pop() {
        if (!stack.isEmpty()) {
            stack.pop();
            minS.pop();
        }
    }

    public int top() {
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        return 0;
    }

    public int getMin() {
        if (!minS.isEmpty()) {
            return minS.peek();
        }
        return 0;
    }
}
