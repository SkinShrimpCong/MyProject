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

    //递归
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

    //双指针方法
//    public static ListNode reverseList2(ListNode head) {
//        ListNode pre = null;
//        ListNode cur = head;
//        while (cur != null) {
//            //注意不能直接等于curr，否则curr对象的变动会带入temp对象
//            ListNode temp = cur.next;
//            cur.next = pre;
//            pre = cur;
//            cur = temp;
//        }
//        return pre;
//    }

    private static ListNode reverseList2(ListNode head) {

        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode temp = cur.next;
            cur.next = pre;
            pre = cur;
            cur = temp;
        }
        return pre;
    }



    public static void main(String[] args){

        ListNode listNode = ListNode.buildListNode(new int[]{1, 2, 3, 4, 5, 6});
        reverseList2(listNode);


    }
}
