package haifeng.cong.leetcode;

/**
 * Description:654. 最大二叉树
 * 给定一个不含重复元素的整数数组 nums 。一个以此数组直接递归构建的 最大二叉树 定义如下：
 *
 * 二叉树的根是数组 nums 中的最大元素。
 * 左子树是通过数组中 最大值左边部分 递归构造出的最大二叉树。
 * 右子树是通过数组中 最大值右边部分 递归构造出的最大二叉树。
 * 返回有给定数组 nums 构建的 最大二叉树 。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/maximum-binary-tree
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/1/28 10:23
 *
 * @author conghaifeng
 */
public class ConstructMaximumBinaryTree {

    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return buildTree(nums, 0, nums.length - 1);
    }

    private TreeNode buildTree(int[] nums, int low ,int high) {
        if (low < 0 || high <= low) {
            return null;
        }
        int val = Integer.MIN_VALUE;
        int mid = 0;
        for (int i = low; i <= high; i++) {
            if (val < nums[i]) {
                val = nums[i];
                mid = i;
            }
        }
        if (val == 0) {

        }
        TreeNode treeNode = new TreeNode(val);
        treeNode.left = buildTree(nums, low, mid - 1);
        treeNode.right = buildTree(nums, mid + 1, high);
        return treeNode;
    }
}
