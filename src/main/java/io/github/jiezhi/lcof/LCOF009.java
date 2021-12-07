package io.github.jiezhi.lcof;

import java.util.Stack;

/**
 * CREATED AT: 2021/10/19
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Easy
 * <p>
 * SEE:
 * <p>
 * DES: 剑指 Offer 09. 用两个栈实现队列
 * <p>
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/yong-liang-ge-zhan-shi-xian-dui-lie-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 * 55 / 55 个通过测试用例
 * 状态：通过
 * 执行用时: 314 ms
 * 内存消耗: 46.3 MB
 */
public class LCOF009 {
    /**
     * 1 <= values <= 10000
     * 最多会对 appendTail、deleteHead 进行 10000 次调用
     */
    static class CQueue {
        // Used for mock queue
        private Stack<Integer> stack1;
        // Used for store temporary data
        private Stack<Integer> stack2;

        public CQueue() {
            stack1 = new Stack();
            stack2 = new Stack();
        }

        public void appendTail(int value) {
            stack1.add(value);
        }

        public int deleteHead() {
            if (stack1.isEmpty()) return -1;
            while (!stack1.isEmpty()) {
                stack2.add(stack1.pop());
            }
            int ret = stack2.pop();
            while (!stack2.isEmpty()) {
                stack1.add(stack2.pop());
            }
            return ret;
        }
    }
}
