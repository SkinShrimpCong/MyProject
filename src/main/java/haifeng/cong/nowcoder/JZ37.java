package haifeng.cong.nowcoder;

import haifeng.cong.leetcode.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Description:剑指 Offer 37. 序列化二叉树
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/22 16:55
 *
 * @author conghaifeng
 */
public class JZ37 {

    public static void main(String[] args){
        System.out.println(serialize(deserialize("[1,2,3,null,null,4,5]")));
    }

    // Encodes a tree to a single string.
    public static String serialize(TreeNode root) {
        if (root == null) {
            return "[]";
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        StringBuilder stringBuilder = new StringBuilder("[");
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node != null) {
                stringBuilder.append(node.val).append(",");
                queue.offer(node.left);
                queue.offer(node.right);
            } else {
                stringBuilder.append("null,");
            }

        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        return stringBuilder.append("]").toString();
    }

    // Decodes your encoded data to tree.
    public static TreeNode deserialize(String data) {
        if(data.equals("[]")) {
            return null;
        }
        String[] split = data.substring(1, data.length() -1).split(",");
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode treeNode = new TreeNode(Integer.valueOf(split[0]));
        queue.offer(treeNode);

        int flag = 1;
        while (flag < split.length) {

            TreeNode node = queue.poll();
            if (!split[flag].equals("null")) {
                node.left = new TreeNode(Integer.valueOf(split[flag]));
                queue.add(node.left);
            }
            flag++;
            if (!split[flag].equals("null")) {
                node.right = new TreeNode(Integer.valueOf(split[flag]));
                queue.add(node.right);
            }
            flag++;
        }
        return treeNode;
    }

}
