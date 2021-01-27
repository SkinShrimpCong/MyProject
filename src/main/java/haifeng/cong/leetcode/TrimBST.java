package haifeng.cong.leetcode;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/1/19 15:13
 *
 * @author conghaifeng
 */
public class TrimBST {

    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) {
            return null;
        }
        // 递归一直从右节点找到大于low的节点
        if (root.val < low) {
            return trimBST(root.right, low, high);
        }
        // 递归一直从左节点找到小于high的节点
        if (root.val > high) {
            return trimBST(root.left, low, high);
        }
        // 递归修剪,将左子树第一个符合范围的节点连接到root.left
        root.left = trimBST(root.left, low, high);
        // 递归修剪,将右子树第一个符合范围的节点连接到root.left
        root.right = trimBST(root.right, low, high);
        return root;
    }


}
