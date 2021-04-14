package haifeng.cong.nowcoder;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/23 11:09
 *
 * @author conghaifeng
 */
public class JZ13 {

    public int movingCount(int m, int n, int k) {
        int[][] board = new int[m][n];
        int num = 0;
        return dfs(board, k, num, 0, 0);
    }

    private int dfs(int[][] board, int k, int num, int row, int column) {
        if (row > board.length - 1 || column > board[0].length - 1 || isBigger(row, column, k) || board[row][column] == -1) {
            return num;
        }
        num++;
        board[row][column] = -1;
        num = dfs(board, k, num, row + 1, column);
        num = dfs(board, k, num, row, column + 1);
        return num;
    }

    private boolean isBigger(int row, int column, int k) {
        int ans = row / 10 + row % 10 + column / 10 + column % 10;
        return ans > k;
    }
}
