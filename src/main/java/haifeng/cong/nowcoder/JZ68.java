package haifeng.cong.nowcoder;

import haifeng.cong.leetcode.TreeNode;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/18 14:11
 *
 * @author conghaifeng
 */
public class JZ68 {

    public static void main(String[] args){
        TreeNode treeNode = new TreeNode(3);
        treeNode.right = new TreeNode(2);
        lowestCommonAncestor(treeNode, treeNode, treeNode.right);
    }

    public static TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode ancestor = root;
        if (p.val <= root.val && q.val >= root.val) {
            return root;
        }

        if (root.val > p.val && root.val > q.val) {
            ancestor = lowestCommonAncestor(root.left, p, q);
        }
        if (root.val < p.val && root.val < q.val) {
            ancestor = lowestCommonAncestor(root.right, p, q);
        }
        return ancestor;
    }

    TreeNode ans;

    public TreeNode lowestCommonAncestor2(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p, q);
        return ans;
    }

    private boolean dfs(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return false;
        }
        boolean left = dfs(root.left, p, q);

        boolean right = dfs(root.right, p, q);

        if ((left && right) || (root.val == p.val || root.val == q.val) && (right || left)) {
            ans = root;
        }
        return left || right || root.val == p.val || root.val == q.val;
    }
}
