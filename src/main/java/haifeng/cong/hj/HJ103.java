package haifeng.cong.hj;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/11 21:14
 *
 * @author conghaifeng
 */
public class HJ103 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            int[] input = new int[num];
            for (int i = 0; i < num; i++) {
                input[i] = scanner.nextInt();
            }
            System.out.println(solve(input));
        }
    }


    public static int solve(int[] input) {
        //已当前高度结束最多步数
        int[] dp = new int[input.length];
        Arrays.fill(dp, 1);
        //当前桩子
        for (int i = 1; i < input.length; i++) {
            //当前桩子之前的
            for (int j = 0; j < i; j++) {
                if (input[i] > input[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
        }
        Arrays.sort(dp);
        return dp[input.length - 1];
    }
}
