package haifeng.cong.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Description: 783. 二叉搜索树节点最小距离
 *
 * 给你一个二叉搜索树的根节点 root ，返回 树中任意两不同节点值之间的最小差值 。
 * Copyright: Copyright (c) 2021
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/4/13 10:44
 *
 * @author conghaifeng
 */
public class LQ783 {

    public int minDiffInBST(TreeNode root) {
        LinkedList<Integer> list = new LinkedList<>();
        List<Integer> ans = helper(root, list);
        int min = Integer.MAX_VALUE;
        for (int i = 1; i < ans.size(); i++) {
            min = Math.min(min, ans.get(i) - ans.get(i - 1));
        }
        return min;
    }

    private List<Integer> helper(TreeNode root, LinkedList<Integer> list) {
        if (root == null) {
            return list;
        }
        helper(root.left, list);
        list.add(root.val);
        helper(root.right, list);
        return list;
    }

    int min = Integer.MAX_VALUE;
    int pre = -1;

    public int minDiffInBST2(TreeNode root) {
        if (root == null) {
            return Integer.MAX_VALUE;
        }
        minDiffInBST2(root.left);
        if (pre == -1) {
            pre = root.val;
        } else {
            min = Math.min(min, root.val - pre);
            pre = root.val;
        }
        minDiffInBST2(root.right);
        return min;
    }


}
