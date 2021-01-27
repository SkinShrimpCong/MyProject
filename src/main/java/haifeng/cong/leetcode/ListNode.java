package haifeng.cong.leetcode;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/1/7 23:11
 *
 * @author conghaifeng
 */
public class ListNode {

    int val;
    ListNode next;
    ListNode(int x) { val = x; }

    public static ListNode buildListNode(int[] arr) {
        if (arr.length == 0) {
            return null;
        }
        ListNode head = new ListNode(arr[0]);
        if (arr.length == 1) {
            return head;
        }
        ListNode curr = head;
        for (int i = 1; i < arr.length ; i++) {
            ListNode listNode = new ListNode(arr[i]);
            curr.next = listNode;
            curr = listNode;
        }
        return head;
    }
}
