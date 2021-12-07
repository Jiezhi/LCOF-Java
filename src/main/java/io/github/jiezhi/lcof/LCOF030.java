package io.github.jiezhi.lcof;

import java.util.ArrayList;
import java.util.List;

/**
 * CREATED AT: 2021/10/19
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Easy
 * <p>
 * SEE: 155
 * <p>
 * DES:剑指 Offer 30. 包含min函数的栈
 * <p>
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
 * 19 / 19 个通过测试用例
 * 状态：通过
 * 执行用时: 17 ms
 * 内存消耗: 41 MB
 */
public class LCOF030 {
    /**
     * push(x) —— 将元素 x 推入栈中。
     * pop()—— 删除栈顶的元素。
     * top()—— 获取栈顶元素。
     * getMin() —— 检索栈中的最小元素。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/min-stack
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    static class MinStack {
        private List<Integer> stack;
        private List<Integer> minStack;
        private int size;

        /**
         * initialize your data structure here.
         */
        public MinStack() {
            stack = new ArrayList<>(20000);
            minStack = new ArrayList<>(20000);
            size = -1;
        }

        public void push(int x) {
            stack.add(x);
            if (minStack.isEmpty()) {
                minStack.add(x);
            } else {
                int lastMinValue = minStack.get(size);
                minStack.add(Math.min(lastMinValue, x));
            }
            size += 1;
        }

        public void pop() {
            stack.remove(size);
            minStack.remove(size);
            size -= 1;
        }

        public int top() {
            return stack.get(size);
        }

        public int min() {
            return minStack.get(size);
        }
    }
}
