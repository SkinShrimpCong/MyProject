package haifeng.cong.leetcode;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/1/19 15:16
 *
 * @author conghaifeng
 */
public class TreeNode {

      public int val;

      public TreeNode left;

      public TreeNode right;

      TreeNode() {}

      public TreeNode(int val) {
          this.val = val;
      }

      public TreeNode(int val, TreeNode left, TreeNode right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
}
