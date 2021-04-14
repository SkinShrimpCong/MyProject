package haifeng.cong.nowcoder;

import haifeng.cong.datastructure.ListNode;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/19 10:47
 *
 * @author conghaifeng
 */
public class JZ52 {

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {

        ListNode headFrist = headA;
        ListNode headSecond = headB;
        while (headFrist != headSecond) {
            if (headFrist != null) {
                headFrist = headFrist.next;
            } else {
                headFrist = headB;
            }

            if (headSecond != null) {
                headSecond = headSecond.next;
            } else {
                headSecond = headA;
            }

        }
        return headFrist;

    }
}
