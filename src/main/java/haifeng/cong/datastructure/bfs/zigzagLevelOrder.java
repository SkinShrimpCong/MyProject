package haifeng.cong.datastructure.bfs;

import haifeng.cong.leetcode.TreeNode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;

/**
 * Description: 之字型层序遍历
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/15 17:14
 *
 * @author conghaifeng
 */
public class zigzagLevelOrder {

    public static void main(String[] args){

    }

    public ArrayList<ArrayList<Integer>> zigzagLevelOrder (TreeNode root) {
        ArrayList<ArrayList<Integer>> ansList = new ArrayList<>();
        if (root == null) {
            return ansList;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int deep = 1;
        while (!queue.isEmpty()) {
            ArrayList<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode treeNode = queue.poll();
                list.add(treeNode.val);
                if (treeNode.left != null) {
                    queue.offer(treeNode.left);
                }
                if (treeNode.right != null) {
                    queue.offer(treeNode.right);
                }
            }

            if (deep % 2 == 0) {
                ansList.add(list);
            } else {
                Collections.reverse(list);
                ansList.add(list);
            }
            deep++;
        }
        return ansList;

    }

//    public ArrayList<ArrayList<Integer>> bfs(ArrayList<ArrayList<Integer>> ansList) {
//        Deque<TreeNode> queue = new LinkedList<>();
//        int deep = 1;
//        while (!queue.isEmpty()) {
//            ArrayList<Integer> list = new ArrayList<>();
//            for (TreeNode treeNode : queue) {
//                TreeNode node = queue.poll();
//                if (node.left != null) {
//                    queue.offer(node.left);
//                    list.add(node.left.val);
//                }
//                if (node.right != null) {
//                    queue.offer(node.right);
//                    list.add(node.right.val);
//                }
//            }
//            if (list.isEmpty()) {
//                break;
//            }
//            if (deep % 2 == 0) {
//                ansList.add(list);
//            } else {
//                Collections.reverse(list);
//                ansList.add(list);
//            }
//            deep++;
//        }
//        return ansList;
//    }
}
