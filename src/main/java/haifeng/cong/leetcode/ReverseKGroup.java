package haifeng.cong.leetcode;

/**
 * Description: K 个一组翻转链表
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/1/11 15:22
 *
 * @author conghaifeng
 */
public class ReverseKGroup {

    //反转a到b之间的节点
    private ListNode reverse(ListNode a, ListNode b) {
        ListNode pre = null, cur = a, next = a;

        while (cur != b) {
            next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        // 返回反转后的头结点
        return pre;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode cur = head;
        for (int i = 0; i < k; i++) {
            if (cur == null) {
                return head;
            }
            cur = cur.next;
        }
        //递归反转前k个的链表
        ListNode newHead = reverse(head, cur);
        //递归反转链表，并将反转后的链表连接起来
        head.next = reverseKGroup(cur, k);
        return newHead;
    }
}
