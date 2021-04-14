package haifeng.cong.nowcoder;

import haifeng.cong.leetcode.TreeNode;

import java.util.HashMap;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/22 18:27
 *
 * @author conghaifeng
 */
public class JZ07 {

    HashMap<Integer, Integer> map = new HashMap<>();

    public TreeNode buildTree(int[] preorder, int[] inorder) {

        for (int i = 0; i < inorder.length; i++) {
            map.put(inorder[i], i);
        }
        return helper(0, 0, inorder.length - 1, preorder);
    }

    //
    private TreeNode helper(int root, int left, int right, int[] preorder) {
        if (left > right) {
            return null;
        }
        Integer rootIndex = map.get(preorder[root]);
        //在前序遍历中：root+      （i - left）      + 1
        //         (根节点下标)    (左子树长度）
        TreeNode treeNode = new TreeNode(preorder[root]);
        treeNode.left = helper(root + 1, left, rootIndex - 1, preorder);
        treeNode.right = helper(root + rootIndex - left + 1, rootIndex + 1, right, preorder);
        return treeNode;
    }

    
}
