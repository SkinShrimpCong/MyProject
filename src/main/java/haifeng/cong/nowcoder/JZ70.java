package haifeng.cong.nowcoder;

import java.util.Stack;

/**
 * Description: 面试题30. 包含min函数的栈
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/19 14:08
 *
 * @author conghaifeng
 */
public class JZ70 {

    public static void main(String[] args){
        JZ70 jz70 = new JZ70();
        jz70.push(-2);
        jz70.push(0);
        jz70.push(-3);
        System.out.println(jz70.min());
        jz70.pop();
        System.out.println(jz70.top());
        System.out.println(jz70.min());
    }

    Stack<Integer> stack = new Stack<>();
    Stack<Integer> help = new Stack<>();

    public JZ70() {

    }

    public void push(int x) {
        stack.push(x);
        if (help.isEmpty() || help.peek() >= x) {
            help.push(x);
        }
    }

    public void pop() {
        Integer pop = stack.pop();
        if (!help.isEmpty() && help.peek().equals(pop)) {
            help.pop();
        }
    }

    public int top() {
       return stack.peek();
    }

    public int min() {
        return help.peek();
    }
}
