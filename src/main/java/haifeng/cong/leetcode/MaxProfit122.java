package haifeng.cong.leetcode;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/12 9:13
 *
 * @author conghaifeng
 */
public class MaxProfit122 {

    public static int maxProfit(int[] prices) {

        int ans = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1]) {
                ans = ans + prices[i] - prices[i - 1];
            }
        }
        return ans;
    }
}
