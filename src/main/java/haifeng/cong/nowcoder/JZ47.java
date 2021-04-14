package haifeng.cong.nowcoder;

/**
 * Description:剑指 Offer 47. 礼物的最大价值
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/18 18:00
 *
 * @author conghaifeng
 */
public class JZ47 {

    public static void main(String[] args){
        int[][] intput = {{1,3,4},{1,5,1},{4,2,1}};
        System.out.println(maxValue(intput));
    }

    public static int maxValue(int[][] grid) {
        int row = grid.length;
        int column = grid[0].length;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {

                if (i - 1 < 0 && j - 1 < 0) {
                    continue;
                }
                if (i - 1 < 0) {
                    grid[i][j] += grid[i][j - 1];
                    continue;
                }
                if (j - 1 < 0) {
                    grid[i][j] += grid[i - 1][j];
                    continue;
                }
                int max = Math.max(grid[i][j - 1], grid[i - 1][j]);
                grid[i][j] += max;
            }
        }

        return grid[row - 1][column - 1];
    }

}
