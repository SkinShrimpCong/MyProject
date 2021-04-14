package haifeng.cong.leetcode;

/**
 * Description: 264. 丑数 II
 * Copyright: Copyright (c) 2021
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/4/11 10:44
 *
 * @author conghaifeng
 */
public class LQ264 {

    public static void main(String[] args) {
        System.out.println(nthUglyNumber(10));
    }

    public static int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;

        int first = 0;
        int second = 0;
        int third = 0;

        for (int i = 1; i < n; i++) {
            dp[i] = Math.min(dp[first] * 2, Math.min(dp[second] * 3, dp[third] * 5));
            if (dp[i] / 2 == dp[first]) {
                first++;
            }
            if (dp[i] / 3 == dp[second]) {
                second++;
            }
            if (dp[i] / 5 == dp[third]) {
                third++;
            }
            
        }
        return dp[n - 1];
    }
}
