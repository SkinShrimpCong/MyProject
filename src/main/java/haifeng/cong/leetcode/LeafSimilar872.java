package haifeng.cong.leetcode;

import java.util.ArrayList;

/**
 * Description:872. 叶子相似的树
 * dfs
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/10 9:21
 *
 * @author conghaifeng
 */
public class LeafSimilar872 {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> leafFirst = new ArrayList<>();
        ArrayList<Integer> leafSecond = new ArrayList<>();
        dfs(root1, leafFirst);
        dfs(root2, leafSecond);
        return leafFirst.equals(leafSecond);
    }

    public void dfs(TreeNode node, ArrayList list) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            list.add(node.val);
            return;
        }
        dfs(node.right, list);
        dfs(node.left, list);
    }


}
