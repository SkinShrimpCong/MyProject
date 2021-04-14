package haifeng.cong.hj;

import java.util.Scanner;

/**
 * Description: 走方格
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/13 11:19
 *
 * @author conghaifeng
 */
public class HJ91 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int n = scanner.nextInt();
            int m = scanner.nextInt();
            System.out.println(solve(n, m, 1, 0, 0));
        }
    }

    public static int solve(int n, int m, int num, int row, int column) {
        if (row > n - 1 || column > m - 1) {
            return num;
        }
        num++;
        num = solve(n , m, num, row + 1, column);
        num = solve(n , m, num, row, column + 1);
        return num;
    }
}
