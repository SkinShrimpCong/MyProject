package haifeng.cong.leetcode;

/**
 * Description: 剑指 Offer 12. 矩阵中的路径
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2020/8/21 9:40
 *
 * @author conghaifeng
 */
public class Exist {
    
    public boolean exist(char[][] board, String word) {

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (dfs(board, word, i, j, 0)) {
                    return true;
                }
            }
        }
        return false;
    }


    private boolean dfs(char[][] board, String word, int i , int j, int k) {
        if (i < 0 || i > board.length - 1 || j < 0 || j > board[0].length - 1 || board[i][j] != word.charAt(k)) {
            return false;
        }

        if (k == word.length() - 1) {
            return true;
        }

        boolean res;
        char temp = board[i][j];
        board[i][j] = '/';
        res = dfs(board, word, i - 1, j, k+1) || dfs(board, word, i, j + 1, k+1) ||
                dfs(board, word, i + 1, j, k+1) || dfs(board, word, i, j - 1, k+1);
        board[i][j] = temp;
        return res;
    }

    public static void main(String[] args){
        char[][] chars = new char[][]{{'a'}};
        Exist exist = new Exist();
        System.out.println(exist.exist(chars, "b"));
    }
}
