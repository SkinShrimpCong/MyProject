package haifeng.cong.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Description: 剑指 Offer 07. 重建二叉树
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2020/8/19 10:48
 *
 * @author conghaifeng
 */
public class BuildTree {

    public TreeNode buildTree(int[] preorder, int[] inorder) {
        //把前序遍历的值和中序遍历的值放到list中
        List<Integer> preorderList = Arrays.stream(preorder).boxed().collect(Collectors.toList());
        List<Integer> inorderList = Arrays.stream(inorder).boxed().collect(Collectors.toList());
        return helper(preorderList, inorderList);
    }

    private TreeNode helper(List<Integer> preorderList, List<Integer> inorderList) {
        if (inorderList.size() == 0) {
            return null;
        }
        //前序遍历的第一个值就是根节点
        int rootVal = preorderList.remove(0);
        //创建跟结点
        TreeNode root = new TreeNode(rootVal);
        //查看根节点在中序遍历中的位置，然后再把中序遍历的数组劈两半，前面部分是
        //根节点左子树的所有值，后面部分是根节点右子树的所有值
        int mid = inorderList.indexOf(rootVal);
        //[0，mid)是左子树的所有值，inorderList.subList(0, mid)表示截取inorderList
        //的值，截取的范围是[0，mid)，包含0不包含mid。
        root.left = helper(preorderList, inorderList.subList(0, mid));
        //[mid+1，inorderList.size())是右子树的所有值，
        // inorderList.subList(mid + 1, inorderList.size())表示截取inorderList
        //的值，截取的范围是[mid+1，inorderList.size())，包含mid+1不包含inorderList.size()。
        root.right = helper(preorderList, inorderList.subList(mid + 1, inorderList.size()));
        return root;
    }

    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }
    }

    public static void main(String[] args){
        BuildTree buildTree = new BuildTree();
        buildTree.buildTree(new int[]{3,9,20,15,7}, new int[]{9,3,15,20,7});

        int[] preorder = {3,9,20,15,7};
        List<Integer> preorderList = new ArrayList<>();
        for (int i = 0; i < preorder.length; i++) {
            preorderList.add(preorder[i]);
        }
        //System.out.println(preorderList.subList(0, preorderList.indexOf(-1)));
    }

}
