package haifeng.cong.hj;

import java.util.Scanner;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/12 11:35
 *
 * @author conghaifeng
 */
public class HJ53 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            System.out.println(solve(scanner.nextInt()));
        }
    }

    public static int solve(int input) {
        int num = input *2 -1;
        int[][] ans = new int[input][num];
        ans[0][num / 2] = 1;
        for (int i = 1; i < input; i++) {
            for (int j = 0; j < num; j++) {
                int left = j - 1;
                int top = j;
                int right = j + 1;
                if (left < 0) {
                    ans[i][j] = ans[i-1][top] + ans[i-1][right];
                } else if (right >= num) {
                    ans[i][j] = ans[i-1][left] + ans[i-1][top];
                } else {
                    ans[i][j] = ans[i-1][left] + ans[i-1][top] + ans[i-1][right];
                }

            }
        }
        for (int i = 0; i < num; i++) {
            if (ans[input - 1][i] % 2 == 0) {
                return i + 1;
            }
        }
        return -1;
    }
}
