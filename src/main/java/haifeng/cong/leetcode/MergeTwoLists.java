package haifeng.cong.leetcode;

/**
 * Description:剑指 Offer 25. 合并两个排序的链表(有点像归并排序)
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/2/25 16:34
 *
 * @author conghaifeng
 */
public class MergeTwoLists {

    ListNode head = new ListNode(0);

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode cur = head;
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                cur.next = l1;
                l1 = l1.next;
                cur = cur.next;
                continue;
            }
            cur.next = l2;
            l2 = l2.next;
            cur = cur.next;

        }
        cur.next = l1 == null? l2 : l1;
        return head.next;

    }



}
