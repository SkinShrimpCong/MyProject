package haifeng.cong.leetcode;

/**
 * Description: 206. 反转链表
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/1/7 22:45
 *
 * @author conghaifeng
 */
public class ReverseList {

    public static ListNode reverseList(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }
        //返回链表头
        ListNode last = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        //返回链表头
        return last;
    }

    public static ListNode reverseList2(ListNode head) {
        ListNode pre = null;
        ListNode curr = head;
        while (curr != null) {
            //注意不能直接等于curr，否则curr对象的变动会带入temp对象
            ListNode temp = curr.next;
            curr.next = pre;
            pre = curr;
            curr = temp;
        }
        return pre;
    }



    public static void main(String[] args){

        ListNode listNode = ListNode.buildListNode(new int[]{1, 2, 3, 4, 5, 6});
        reverseList2(listNode);


    }
}
