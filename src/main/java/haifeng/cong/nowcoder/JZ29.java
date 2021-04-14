package haifeng.cong.nowcoder;

import java.util.Arrays;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/23 14:47
 *
 * @author conghaifeng
 */
public class JZ29 {

    public static void main(String[] args){
        int[][] input = {{1,2,3},{4,5,6},{7,8,9}};
        int[] ints = spiralOrder(input);
        System.out.println(Arrays.toString(ints));
    }

    public static int[] spiralOrder(int[][] matrix) {

        if (matrix.length == 0) {
            return new int[]{};
        }

        int top = 0;
        int right = matrix[0].length -1;
        int button = matrix.length - 1;
        int left = 0;
        int[] ans = new int[(right + 1) * (button + 1)];

        int flag = 0;

        while (true) {
            for (int i = left; i <= right; i++) {
                ans[flag++] = matrix[top][i];
            }
            if (++top > button) {
                break;
            }
            for (int i = top; i <= button; i++) {
                ans[flag++] = matrix[i][right];
            }
            if (--right < left) {
                break;
            }
            for (int i = right; i >=left ; i--) {
                ans[flag++] = matrix[button][i];
            }
            if (top > --button) {
                break;
            }
            for (int i = button; i >= top; i--) {
                ans[flag++] = matrix[i][left];
            }
            if (right < ++left) {
                break;
            }
        }
        return ans;

    }
}
