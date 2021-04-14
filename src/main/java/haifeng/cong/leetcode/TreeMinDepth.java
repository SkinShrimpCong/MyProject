package haifeng.cong.leetcode;

import java.util.Deque;
import java.util.LinkedList;

/**
 * Description:111. 二叉树的最小深度
 * 求最小深度使用bfs广度遍历
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/2/27 22:45
 *
 * @author conghaifeng
 */
public class TreeMinDepth {

    public int minDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        //存放队列
        Deque<TreeNode> deque = new LinkedList<>();

        //访问过的，树不需要

        //将头节点加入队列
        deque.offer(root);

        //步数
        int level = 1;

        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = deque.poll();
                if (cur.right == null && cur.left == null) {
                    return level;
                }
                if (cur.right != null) {
                    deque.offer(cur.right);
                }
                if (cur.left != null) {
                    deque.offer(cur.left);
                }
            }
            level++;
        }
        return level;
    }

    public static int minDepth2(TreeNode root) {
        if (root == null) {
            return 0;
        }
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        int level = 1;
        while (!deque.isEmpty()) {
            int size = deque.size();
            for (int i = 0; i < size; i++) {
                TreeNode cur = deque.poll();
                if (cur.right == null && cur.left == null){
                    return level;
                }
                if (cur.left!=null){
                    deque.offer(cur.left);
                }
                if (cur.right!=null){
                    deque.offer(cur.right);
                }
            }
            level++;
        }
        return level;
    }

    public static void main(String[] args){

    }


}
