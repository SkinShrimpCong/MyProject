package haifeng.cong.nowcoder;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/20 10:04
 *
 * @author conghaifeng
 */
public class JZ59 {

    public static void main(String[] args){
        JZ59 jz59 = new JZ59();
        jz59.push_back(1);
        jz59.push_back(3);
        jz59.push_back(2);
        System.out.println(jz59.max_value());
        jz59.pop_front();
        jz59.pop_front();
        jz59.push_back(1);
        System.out.println(jz59.max_value());
    }

    Queue<Integer> queue = new LinkedList<>();
    Deque<Integer> deque = new LinkedList<>();

    public JZ59() {

    }

    public int max_value() {
        return deque.isEmpty() ? -1 : deque.peekFirst();
    }

    public void push_back(int value) {
        queue.offer(value);
        while (!deque.isEmpty() && value > deque.peekLast()) {
            deque.removeLast();
        }
        deque.offerLast(value);
    }

    public int pop_front() {
        if (queue.isEmpty()) {
            return -1;
        }
        Integer poll = queue.poll();
        if (poll.equals(deque.peekFirst())) {
            deque.removeFirst();
        }
        return poll;
    }
}
