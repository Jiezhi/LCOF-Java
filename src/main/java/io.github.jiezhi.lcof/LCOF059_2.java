package io.github.jiezhi.lcof;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Queue;

/**
 * CREATED AT: 2021/11/18
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Medium
 * <p>
 * SEE:
 * <p>
 * DES: 剑指 Offer 59 - II. 队列的最大值
 * <p>
 * 请定义一个队列并实现函数 max_value 得到队列里的最大值，要求函数max_value、push_back 和 pop_front 的均摊时间复杂度都是O(1)。
 * <p>
 * 若队列为空，pop_front 和 max_value 需要返回 -1
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/dui-lie-de-zui-da-zhi-lcof
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 */
public class LCOF059_2 {
    /**
     * 34 / 34 个通过测试用例
     * 状态：通过
     * 执行用时: 39 ms
     * 内存消耗: 46.4 MB
     * <p>
     * <p>
     * 1 <= push_back,pop_front,max_value的总操作数 <= 10000
     * 1 <= value <= 10^5
     */
    public static class MaxQueue {
        private Queue<int[]> queue;
        private Deque<int[]> maxValueDeque;
        // used for recording head position, and total operations count no more than 10000, int type is ok
        private int head;

        public MaxQueue() {
            queue = new ArrayDeque<>();
            maxValueDeque = new ArrayDeque<>();
            head = 0;
        }

        public int max_value() {
            if (maxValueDeque.isEmpty()) {
                return -1;
            }
            return maxValueDeque.peekFirst()[0];
        }

        public void push_back(int value) {
            queue.offer(new int[]{value, head});
            while (!maxValueDeque.isEmpty() && maxValueDeque.peekLast()[0] <= value) {
                maxValueDeque.pollLast();
            }
            maxValueDeque.offer(new int[]{value, head});
            head++;
        }

        public int pop_front() {
            if (queue.isEmpty()) return -1;
            if (!maxValueDeque.isEmpty() && maxValueDeque.peekFirst()[1] <= queue.peek()[1]) {
                maxValueDeque.pollFirst();
            }
            return queue.poll()[0];
        }
    }
}
