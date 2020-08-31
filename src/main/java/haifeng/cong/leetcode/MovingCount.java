package haifeng.cong.leetcode;

/**
 * Description: 剑指 Offer 13. 机器人的运动范围
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2020/8/26 9:13
 *
 * @author conghaifeng
 */
public class MovingCount {

    public int movingCount(int m, int n, int k) {
        int[][] board = new int[m][n];
        int num = 0;
        return dfs(board, k, num, 0, 0);
    }

    private int dfs(int[][] board, int k, int num, int i, int j) {
        if (i >= board.length || j >= board[0].length || isSmaller(i, j, k) || board[i][j] == -1) {
            return num;
        }

        board[i][j] = -1;
        num++;
        num = dfs(board, k, num, i+1, j);
        num = dfs(board, k, num, i, j+1);
        return num;
    }

    private boolean isSmaller(int i, int j, int k) {
        int anw = i / 10 + j / 10 + i % 10 + j % 10;
        return anw > k;
    }

    public static void main(String[] args){
        MovingCount movingCount = new MovingCount();
        System.out.println(movingCount.movingCount(1, 2, 1));
    }
}
