package haifeng.cong.leetcode;

/**
 * Description: 82. 删除排序链表中的重复元素 II
 *
 * head 有可能需要改动时，先增加一个 假head，返回的时候直接取 假head.next，这样就不需要为修改 head 增加一大堆逻辑了。
 *
 * Copyright: Copyright (c) 2021
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/25 21:23
 *
 * @Author conghaifeng
 */
public class LQ82 {

    public static void main(String[] args){
        ListNode listNode = ListNode.buildListNode(new int[]{1, 2, 3, 3, 4, 4, 5});
        deleteDuplicates(listNode);
    }

    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode tempHead = new ListNode(0);
        tempHead.next = head;

        ListNode cur = head;
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val == cur.next.next.val) {
                int temp = cur.next.val;
                while (cur.next != null && temp == cur.next.val) {
                    cur.next = cur.next.next;
                }
            } else {
                cur = cur.next;
            }

        }
        return tempHead.next;
    }
}
