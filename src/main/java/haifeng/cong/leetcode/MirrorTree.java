package haifeng.cong.leetcode;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/2/26 11:19
 *
 * @author conghaifeng
 */
public class MirrorTree {

    public TreeNode mirrorTree(TreeNode root) {

        helper(root);
        return root;
    }

    public void helper(TreeNode treeNode) {
        if (treeNode == null) {
            return;
        }
        TreeNode temp = treeNode.left;
        treeNode.left = treeNode.right;
        treeNode.right = temp;
        helper(treeNode.left);
        helper(treeNode.right);
    }


}
