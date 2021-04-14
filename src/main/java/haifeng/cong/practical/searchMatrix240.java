package haifeng.cong.practical;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/6 0:28
 *
 * @author conghaifeng
 */
public class searchMatrix240 {

    public boolean searchMatrix(int[][] matrix, int target) {
        int row = 0;
        int column = matrix[0].length - 1;
        while (column >= 0 && row < matrix.length) {
            if (target == matrix[row][column]) {
                return true;
            }
            if (target > matrix[row][column]) {
                row++;
            } else {
                column--;
            }

        }
        return false;
    }
}
