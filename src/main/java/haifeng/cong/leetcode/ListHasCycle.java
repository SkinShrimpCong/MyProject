package haifeng.cong.leetcode;

/**
 * Description:141. 环形链表
 * 快慢指针解法
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/2/28 1:11
 *
 * @author conghaifeng
 */
public class ListHasCycle {

    public boolean hasCycle(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }



}
