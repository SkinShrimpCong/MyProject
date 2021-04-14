package haifeng.cong.practical;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/5 17:55
 *
 * @author conghaifeng
 */
public class SearchMatrix {

    public static void main(String[] args){
        int[][] matrix = {{1}};
        System.out.println(searchMatrix(matrix, 2));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int row = matrix.length;
        int column = matrix[0].length;
        return helper(matrix, target, 0, row * column -1);
    }

    public static boolean helper(int[][] matrix, int target, int left, int right) {
        if (left > right) {
            return false;
        }
        int mid = (left + right) / 2;
        int row = mid / matrix[0].length;
        int column = mid % matrix[0].length;
        if (target == matrix[row][column]) {
            return true;
        }
        if (target > matrix[row][column]) {
            return helper(matrix, target, mid + 1, right);
        }
        return helper(matrix, target, left, mid - 1);

    }

    public static boolean searchMatrix2(int[][] matrix, int target) {
        int m = matrix.length;
        if (m == 0) return false;
        int n = matrix[0].length;

        // 二分查找
        int left = 0, right = m * n - 1;
        int pivotIdx, pivotElement;
        while (left <= right) {
            pivotIdx = (left + right) / 2;
            pivotElement = matrix[pivotIdx / n][pivotIdx % n];
            if (target == pivotElement) {
                return true;
            } else {
                if (target < pivotElement) {
                    right = pivotIdx - 1;
                } else {
                    left = pivotIdx + 1;
                }
            }
        }
        return false;
    }

}
