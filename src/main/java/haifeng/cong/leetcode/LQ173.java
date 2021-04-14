package haifeng.cong.leetcode;

import java.util.LinkedList;

/**
 * Description: 173. 二叉搜索树迭代器
 * Copyright: Copyright (c) 2021
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/28 12:16
 *
 * @Author conghaifeng
 */
public class LQ173 {

    LinkedList<TreeNode> list = new LinkedList<>();

    public LQ173(TreeNode root) {
        buildList(root);
    }

    public int next() {
        return list.poll().val;
    }

    public boolean hasNext() {
        return list.isEmpty();
    }

    private void buildList(TreeNode root) {
        if (root == null) {
            return;
        }
        buildList(root.left);
        list.add(root);
        buildList(root.right);
    }

}
