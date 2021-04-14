package haifeng.cong.leetcode;

/**
 * Description: 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
 * Copyright: Copyright (c) 2021
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/27 10:39
 *
 * @Author conghaifeng
 */
public class LQ61 {

    public static void main(String[] args){
        ListNode listNode = ListNode.buildListNode(new int[]{1, 2});
        rotateRight(listNode, 4);
    }

    public static ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null) {
            return head;
        }
        int temp = k;
        ListNode pre = head;
        ListNode cur = head;
        while (cur.next != null && temp > 0) {
            cur = cur.next;
            temp--;
        }
        if (temp == 0) {
            while (cur.next != null) {
                cur = cur.next;
                pre = pre.next;
            }
            cur.next = head;
            head = pre.next;
            pre.next = null;
        } else {
            int kTemp = k % (k - temp + 1);
            pre = head;
            cur = head;
            while (cur.next != null && kTemp > 0) {
                cur = cur.next;
                kTemp--;
            }
            while (cur.next != null) {
                cur = cur.next;
                pre = pre.next;
            }
            cur.next = head;
            head = pre.next;
            pre.next = null;
        }

        return head;
    }
}
