package haifeng.cong.leetcode;

/**
 * Description:对称的二叉树
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/2/26 13:56
 *
 * @author conghaifeng
 */
public class SymmetricTree {

    public boolean isSymmetric(TreeNode root) {
        return help(root, root);
    }

    public boolean help(TreeNode node1, TreeNode node2) {
        if (node1 == null && node2 == null) {
            return true;
        }
        if (node1 == null || node2 == null) {
            return false;
        }
        return node1.val == node2.val && help(node1.left, node2.right) && help(node1.right, node2.left);
    }
}
