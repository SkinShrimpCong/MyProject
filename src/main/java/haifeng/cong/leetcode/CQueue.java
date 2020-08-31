package haifeng.cong.leetcode;

import java.util.Stack;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2020/8/18 16:40
 *
 * @author conghaifeng
 */
public class CQueue {

    Stack<Integer> stack1 = new Stack<>();

    Stack<Integer> stack2 = new Stack<>();

    public CQueue() {

    }

    public void appendTail(int value) {
        stack1.push(value);
    }

    public int deleteHead() {

        if (stack2.isEmpty()) {
            popAndPush(stack1, stack2);
        }
        if (stack2.isEmpty()) {
            return -1;
        }
        return stack2.pop();
    }

    public void popAndPush(Stack<Integer> stack1, Stack<Integer> stack2) {
        int size = stack1.size();
        for (int i = 0; i < size; i++) {
            stack2.push(stack1.pop());
        }
    }
}
