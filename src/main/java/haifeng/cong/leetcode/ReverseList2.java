package haifeng.cong.leetcode;

/**
 * Description: 92. 反转链表 II
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/1/10 22:36
 *
 * @author conghaifeng
 */
public class ReverseList2 {

    public static ListNode successor;


    public ListNode reverseBetween(ListNode head, int m, int n) {
        if (m == 1) {
            return reverseN(head, n);
        }
        //递归到启动点进行反转，并将启动点连接到原来最后的节点
        head.next = reverseBetween(head.next, m - 1, n - 1);
        return head;
    }

    private ListNode reverseN(ListNode head, int n) {
        if (n == 1) {
            successor = head.next;
            return head;
        }

        ListNode last = reverseN(head.next, n - 1);
        head.next.next = head;
        head.next = successor;
        return last;
    }
}
