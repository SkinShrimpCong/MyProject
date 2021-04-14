package haifeng.cong.leetcode;

import java.util.Stack;

/**
 * Description: 面试题 17.21. 直方图的水量
 *
 * 给定一个直方图(也称柱状图)，假设有人从上面源源不断地倒水，最后直方图能存多少水量?直方图的宽度为 1。
 * Copyright: Copyright (c) 2021
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/4/2 21:45
 *
 * @author conghaifeng
 */
public class LQ1721 {

    public static void main(String[] args){
        System.out.println(trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }

    public static int trap(int[] height) {

        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        stack.push(0);
        for (int i = 1; i < height.length; i++) {
            while (!stack.isEmpty() && height[i] > height[stack.peek()]) {
                int top = stack.pop();
                if (stack.isEmpty()) {
                    break;
                }
                int left = stack.peek();
                ans = ans + (i - left - 1) * (Math.min(height[i], height[left]) - height[top]);
            }
            stack.push(i);
        }
        return ans;

    }
}
