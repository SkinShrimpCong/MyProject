package haifeng.cong.leetcode;

import java.util.Arrays;
import java.util.Stack;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2020/8/18 10:40
 *
 * @author conghaifeng
 */
public class ReversePrint {

    public static class ListNode {
      int val;
      ListNode next;
      ListNode(int x) { val = x; }
    }

    public static int[] reversePrint(ListNode head) {
        Stack<Integer> stack = new Stack<>();
        Integer flag = 0;
        while (head != null) {
            stack.add(head.val);
            head = head.next;
            flag++;
        }
        int[] ints = new int[flag];
        for (int i = 0; i < flag; i++) {
            ints[i] = stack.pop();
        }
        return ints;
    }

    public static void main(String[] args){
        ListNode listNode1 = new ListNode(1);
        ListNode listNode2 = new ListNode(3);
        ListNode listNode3 = new ListNode(2);
        listNode1.next = listNode2;
        listNode2.next = listNode3;
        System.out.println(Arrays.toString(reversePrint(listNode1)));
    }
}
