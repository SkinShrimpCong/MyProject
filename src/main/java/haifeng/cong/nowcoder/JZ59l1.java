package haifeng.cong.nowcoder;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/22 12:42
 *
 * @author conghaifeng
 */
public class JZ59l1 {

    public static void main(String[] args){
        JZ59l1 jz59l1 = new JZ59l1();
        System.out.println(jz59l1.maxSlidingWindow(new int[]{1,3,1,2,0,5}, 3));
    }


    Deque<Integer> deque = new LinkedList<>();

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) {
            return new int[]{};
        }
        int[] ans = new int[nums.length - k + 1];
        for (int i = 0; i < k; i++) {
            add(nums[i]);
        }
        for (int i = 0; i < ans.length - 1; i++) {
            ans[i] = deque.peekFirst();
            remove(nums[i]);
            add(nums[i + k]);

        }
        ans[ans.length - 1] = deque.peekFirst();
        return ans;
    }

    private void add(int value) {
        while (!deque.isEmpty() && value > deque.getLast()) {
            deque.removeLast();
        }
        deque.addLast(value);
    }

    private void remove(int value) {
        if (value == deque.getFirst()) {
            deque.removeFirst();
        }
    }




}
