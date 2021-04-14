package haifeng.cong.leetcode;

import java.util.*;

/**
 * Description: 8皇后问题，使用回溯法解决
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/2/25 14:40
 *
 * @author conghaifeng
 */
public class SolveNQueens {

    ArrayList<List<String>> solutions = new ArrayList<>();
    Set<Integer> columns = new HashSet<Integer>();//是否同列
    Set<Integer> diagonals1 = new HashSet<Integer>();//是否同第一个斜线
    Set<Integer> diagonals2 = new HashSet<Integer>();//是否同第二个斜线

    public List<List<String>> solveNQueens(int n) {

        int[] queens = new int[n];//
        Arrays.fill(queens, -1);
        cal8BackTrack(queens, n, 0);
        return solutions;
    }

    public void cal8BackTrack(int[] queens, int n, int row) {
        if (row == n) {
            //生成一个解法存入解法
            solutions.add(generator(queens, n));

        }
        for (int i = 0; i < n; i++) {
            if (columns.contains(i)) {
                continue;
            }
            int dia1 = i + row;
            if (diagonals1.contains(dia1)) {
                continue;
            }
            int dia2 = i - row;
            if (diagonals2.contains(dia2)) {
                continue;
            }
            queens[row] = i;
            columns.add(i);
            diagonals1.add(i + row);
            diagonals2.add(i - row);
            cal8BackTrack(queens, n, row + 1);
            queens[row] = -1;
            columns.remove(i);
            diagonals1.remove(i + row);
            diagonals2.remove(i - row);
        }

    }

    public List<String> generator(int[] queens, int n) {
        ArrayList<String> board = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            char[] rows = new char[n];
            Arrays.fill(rows, '.');
            rows[queens[i]] = 'Q';
            board.add(new String(rows));
        }

        return board;
    }


    public static void main(String[] args){
        SolveNQueens solveNQueens = new SolveNQueens();
        solveNQueens.solveNQueens(4);
    }
}
