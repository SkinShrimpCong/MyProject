package haifeng.cong.leetcode;

import java.util.Stack;

/**
 * Description: 456. 132 模式
 * 单调栈
 * 今天的单调栈的使用还是有点技巧的，当我们遍历到一个位置 ii 需要寻找数组中左边或者右边的所有数字和 nums[i]nums[i] 的大小关系的题目，可以考虑一下单调栈。
 *
 * Copyright: Copyright (c) 2021
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/24 21:59
 *
 * @Author conghaifeng
 */
public class Leetcode456 {

    public static void main(String[] args){
        find132pattern(new int[]{1,3,2,4,5,6,7,8,9,10});
    }

    public static boolean find132pattern(int[] nums) {

        Stack<Integer> stack = new Stack<>();

        int third = Integer.MIN_VALUE;

        for (int i = nums.length - 1; i >= 0; i--) {
            if (nums[i] < third) {
                return true;
            }
            while (!stack.isEmpty() && stack.peek() < nums[i]) {
                third = stack.pop();
            }
            if (nums[i] > third) {
                stack.push(nums[i]);
            }

        }
        return false;
    }
}
