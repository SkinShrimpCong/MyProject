package haifeng.cong.practical;

import java.util.*;

/**
 * Description:739. 每日温度
 * 下一个出现的最大数字(单调栈通用）
 * 判别是否需要使用单调栈，如果需要找到左边或者右边第一个比当前位置的数大或者小，则可以考虑使用单调栈；单调栈的题目如矩形米面积等等
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/4 10:56
 *
 * @author conghaifeng
 */
public class DailyTemperatures739 {

    public static void main(String[] args){
        int[] array = {73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(dailyTemperatures2(array)));
    }

    public int[] dailyTemperatures(int[] T) {
        int[] ans = new int[T.length];
        Arrays.fill(ans, 0);
        for (int i = 0; i < T.length; i++) {
            for (int j = i+1; j < T.length; j++) {
                if (T[i] < T[j]) {
                    ans[i] = j - i;
                    break;
                }
            }
        }
        return ans;
    }

    //采用单调栈(增)
    public static int[] dailyTemperatures2(int[] T) {
        int[] ans = new int[T.length];
        Arrays.fill(ans, 0);

        //用于存放温度的下表
        Stack<Integer> stack = new Stack<>();
        Deque<Integer> stack2 = new LinkedList<Integer>();
        Queue<Integer> queue = new LinkedList<Integer>();
        for (int i = 0; i < T.length; i++) {
            int preIndex;
            while (!stack.empty() && T[stack.peek()] < T[i]) {
                preIndex = stack.pop();
                ans[preIndex] = i - preIndex;
            }
            stack.push(i);
        }
        return ans;
    }

}














