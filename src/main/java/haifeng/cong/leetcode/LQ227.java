package haifeng.cong.leetcode;

import java.util.Stack;

/**
 * Description: 227. 基本计算器 II
 * Copyright: Copyright (c) 2021
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/4/1 18:02
 *
 * @Author conghaifeng
 */
public class LQ227 {

    public static void main(String[] args){
        System.out.println(calculate("11 "));
    }

    public static int calculate(String s) {
        s = s.replace(" ", "");
        Stack<Integer> stack = new Stack<>();

        char pre = '+';

        for (int i = 0; i < s.length(); i++) {
            int ans = 0;
            while (i < s.length() && Character.isDigit(s.charAt(i))) {
                ans = ans * 10 + (s.charAt(i++) - '0');
            }
            switch (pre) {
                case '*':
                    stack.push(stack.pop() * ans);
                    break;
                case '/':
                    stack.push(stack.pop() / ans);
                    break;
                case '+':
                    stack.push(ans);
                    break;
                case '-':
                    stack.push(-ans);
                    break;
                default:
            }
            if (i < s.length()) {
                pre = s.charAt(i);
            }

        }
        int ans = 0;
        while (!stack.isEmpty()) {
            ans+=stack.pop();
        }
        return ans;
    }
}
