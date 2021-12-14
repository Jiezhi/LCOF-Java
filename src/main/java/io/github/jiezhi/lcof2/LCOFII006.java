package io.github.jiezhi.lcof2;

/**
 * CREATED AT: 2021/12/14
 * <p>
 * PROJECT: LCOF-Java
 * <p>
 * https://github.com/Jiezhi/LCOF-Java
 * <p>
 * Difficulty: Easy
 * <p>
 * SEE: 167
 * <p>
 * DES: 剑指 Offer II 006. 排序数组中两个数字之和
 * <p>
 * 给定一个已按照 升序排列 的整数数组 numbers ，请你从数组中找出两个数满足相加之和等于目标数target 。
 * <p>
 * 函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。numbers 的下标 从 0开始计数 ，所以答案数组应当满足 0<= answer[0] < answer[1] <numbers.length。
 * <p>
 * 假设数组中存在且只存在一对符合条件的数字，同时一个数字不能使用两次。
 * <p>
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/kLl5u1
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 * <p>
 */
public class LCOFII006 {
    /**
     * 19 / 19 个通过测试用例
     * 状态：通过
     * 执行用时: 0 ms
     * 内存消耗: 38.2 MB
     *
     * @param numbers 2 <= numbers.length <= 3 * 10^4
     *                -1000 <= numbers[i] <= 1000
     *                numbers 按 递增顺序 排列
     * @param target  -1000 <= target <= 1000
     * @return 仅存在一个有效答案, 0 <= answer[0] < answer[1] < numbers.length
     */
    public int[] twoSum(int[] numbers, int target) {
        int low = 0;
        int high = numbers.length - 1;
        int ret;
        while (low < high) {
            ret = numbers[low] + numbers[high];
            if (ret == target) return new int[]{low, high};
            if (ret > target) high--;
            else low++;
        }
        return null;
    }
}
