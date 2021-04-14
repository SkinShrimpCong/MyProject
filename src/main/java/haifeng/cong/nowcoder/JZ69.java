package haifeng.cong.nowcoder;

import haifeng.cong.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/18 13:34
 *
 * @author conghaifeng
 */
public class JZ69 {

    List<List<Integer>> ans = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if (root == null) {
            return ans;
        }
        return backTrack(root, target, new LinkedList<>());
    }

    private List<List<Integer>> backTrack(TreeNode root, int target, LinkedList<Integer> list) {
        list.add(root.val);
        if (target == root.val && root.right == null && root.left == null) {
            ans.add(new LinkedList<>(list));
        }
        if (root.left != null) {
            backTrack(root.left, target - root.val, list);
        }
        if (root.right != null) {
            backTrack(root.right, target - root.val, list);
        }

        list.removeLast();
        return ans;
    }
}
