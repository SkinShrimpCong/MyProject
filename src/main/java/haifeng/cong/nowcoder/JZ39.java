package haifeng.cong.nowcoder;

import haifeng.cong.leetcode.TreeNode;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/18 11:30
 *
 * @author conghaifeng
 */
public class JZ39 {

    public static void main(String[] args){
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.left.left = new TreeNode(3);
        treeNode.left.left.left = new TreeNode(4);
        treeNode.right = new TreeNode(2);
        treeNode.right.right = new TreeNode(3);
        treeNode.right.right.right = new TreeNode(4);
        JZ39 jz39 = new JZ39();
        jz39.IsBalanced_Solution(treeNode);
    }

    public boolean IsBalanced_Solution(TreeNode root) {

        if (root == null) {
            return true;
        }

        return solveMax(root, 0) - solveMin(root, 0) < 2;

    }

    public int solveMax(TreeNode root, int deep) {
        if (root.left == null && root.right == null) {
            return deep;
        }

        int deepLeft = 0;
        int deepRight = 0;
        if (root.left != null) {
            deepLeft = solveMax(root.left, deep + 1);
        }
        if (root.right != null) {
            deepRight = solveMax(root.right, deep + 1);
        }

        return Math.max(deepLeft, deepRight);
    }

    public int solveMin(TreeNode root, int deep) {
        if (root.left == null || root.right == null) {
            return deep;
        }
        int deepLeft = solveMin(root.left, deep + 1);
        int deepRight = solveMin(root.right, deep + 1);
        return Math.min(deepLeft, deepRight);
    }
}
