package haifeng.cong.nowcoder;

import haifeng.cong.leetcode.TreeNode;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/22 14:39
 *
 * @author conghaifeng
 */
public class JZ54 {

    public static void main(String[] args){
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(2);
        treeNode.right = new TreeNode(4);
        kthLargest(treeNode, 1);
    }

    static int ans = 0;

    public static int kthLargest(TreeNode root, int k) {

        solve(root, k);
        return ans;

    }

    public static void solve(TreeNode root, int index) {
        if (root == null) {
            return;
        }
        solve(root.right, index);
        if (index == 0) {
            return;
        }
        if (--index == 0) {
            ans = root.val;
            return;
        }
        solve(root.left, index);
    }


}
