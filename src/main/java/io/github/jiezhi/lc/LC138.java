package io.github.jiezhi.lc;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/**
 * CREATED AT: 2022/3/12
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
class RandomNode {
    int val;
    RandomNode next;
    RandomNode random;

    public RandomNode(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}

public class LC138 {
    /**
     * 执行用时：0 ms, 在所有 Java 提交中击败了100.00%的用户
     * 内存消耗：41.1 MB, 在所有 Java 提交中击败了14.14%的用户
     * 通过测试用例：19 / 19
     * <p>
     * 0 <= n <= 1000
     * -10^4 <= Node.val <= 10^4
     * Node.random 为 null 或指向链表中的节点。
     */
    public RandomNode copyRandomList(RandomNode head) {
        if (head == null) return null;

        Map<RandomNode, Integer> nodeMap = new HashMap<>();
        Map<Integer, RandomNode> newNodeMap = new HashMap<>();

        nodeMap.put(head, 0);
        RandomNode newHead = new RandomNode(head.val);
        RandomNode newNode = newHead;

        newNodeMap.put(0, newHead);

        RandomNode node = head.next;
        int pos = 1;
        while (node != null) {
            newNode.next = new RandomNode(node.val);
            nodeMap.put(node, pos);
            node = node.next;
            newNode = newNode.next;
            newNodeMap.put(pos, newNode);
            pos++;
        }


        node = head;
        newNode = newHead;
        while (node != null) {
            if (node.random == null) {
                node = node.next;
                newNode = newNode.next;
                continue;
            }

            newNode.random = newNodeMap.get(nodeMap.get(node.random));
            node = node.next;
            newNode = newNode.next;
        }

        return newHead;
    }
}
