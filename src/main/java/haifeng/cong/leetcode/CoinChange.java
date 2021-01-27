package haifeng.cong.leetcode;

import java.util.Arrays;

/**
 * Description: 322. 零钱兑换
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/1/13 16:13
 *
 * @author conghaifeng
 */
public class CoinChange {

    public static int coinChange1(int[] coins, int amount) {
        int[] dp = new int[amount + 1];

        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        for (int i = 1; i <= amount; ++i) {
            for (int j = 0; j < coins.length; ++j) {
                if (coins[j] <= i && dp[i - coins[j]] != Integer.MAX_VALUE) {
                    dp[i] = Math.min(dp[i - coins[j]] + 1, dp[i]);
                }
            }
        }
        return dp[amount] > amount ? -1 : dp[amount];
    }

    public static int coinChange2(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        return coinChange(coins, amount, dp);
    }

    private static int coinChange(int[] coins, int amount, int[] dp) {
        if (amount < 0) {
            return -1;
        }

        if (amount == 0) {
            return 0;
        }
        if (dp[amount] != 0) {
            return dp[amount];
        }
        int min = Integer.MAX_VALUE;
        for (int conin :coins) {

            int anw = coinChange(coins, amount - conin, dp);
            if (anw >= 0) {
                min = Math.min(min, anw + 1);
            }

        }
        dp[amount] = min == Integer.MAX_VALUE ? -1 : min;
        return dp[amount] ;
    }

    public static void main(String[] args){
        System.out.println(coinChange1(new int[]{1,2,5}, 11));
    }
}
