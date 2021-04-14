package haifeng.cong.nowcoder;

import haifeng.cong.leetcode.TreeNode;

/**
 * Description: 剑指 Offer 36. 二叉搜索树与双向链表
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/22 22:28
 *
 * @author conghaifeng
 */
public class JZ36 {

    TreeNode head, pre;

    public TreeNode treeToDoublyList(TreeNode root) {
        dfs(root);
        head.left = pre;
        pre.right = head;
        return head;
    }

    private void dfs(TreeNode cur) {
        if (cur == null) {
            return;
        }
        dfs(cur.left);
        if (pre == null) {
            head = cur;
        } else {
            pre.right = cur;
        }
        cur.left = pre;
        pre = cur;
        dfs(cur.right);
    }


}
