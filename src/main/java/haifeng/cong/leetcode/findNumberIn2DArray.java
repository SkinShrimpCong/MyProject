package haifeng.cong.leetcode;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2020/8/18 9:30
 *
 * @author conghaifeng
 */
public class findNumberIn2DArray {

    public boolean findNumberIn2DArray(int[][] matrix, int target) {

        if (matrix == null || matrix.length == 0 || matrix[0].length ==0) {
            return false;
        }

        int rows = matrix.length;
        int colunms = matrix[0].length;

        int row = 0;
        int colunm = colunms - 1;

        while (row < rows && colunm >= 0) {
            if (matrix[row][colunm] == target) {
                return true;
            }
            if (matrix[row][colunm] > target) {
                colunm--;
            } else {
                row++;
            }
        }

        return false;

    }
}
