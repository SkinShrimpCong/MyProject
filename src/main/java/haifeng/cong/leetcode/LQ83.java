package haifeng.cong.leetcode;

/**
 * Description: 83. 删除排序链表中的重复元素
 * Copyright: Copyright (c) 2021
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/26 15:48
 *
 * @Author conghaifeng
 */
public class LQ83 {

    public static void main(String[] args){
        ListNode listNode = ListNode.buildListNode(new int[]{1, 2, 3, 3, 4, 4, 5});
        deleteDuplicates(listNode);
    }

    public static ListNode deleteDuplicates(ListNode head) {

        if (head == null) {
            return head;
        }

        ListNode cur = head;
        while (cur.next != null) {
            if (cur.val == cur.next.val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return head;
    }
}
