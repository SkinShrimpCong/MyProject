package haifeng.cong.leetcode;

import java.util.Stack;

/**
 * Description: 150. 逆波兰表达式求值
 * Copyright: Copyright (c) 2021
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/26 15:49
 *
 * @Author conghaifeng
 */
public class LQ150 {

    public static void main(String[] args){
        System.out.println(evalRPN(new String[]{"4","13","5","/","+"}));
    }


    public static int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            switch (tokens[i]) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    int secondMin = stack.pop();
                    int firstMin = stack.pop();
                    stack.push(firstMin - secondMin);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    int second = stack.pop();
                    int first = stack.pop();
                    stack.push(first / second);
                    break;
                default:
                    stack.push(Integer.valueOf(tokens[i]));
                    break;
            }
        }
        return stack.pop();
    }
}
