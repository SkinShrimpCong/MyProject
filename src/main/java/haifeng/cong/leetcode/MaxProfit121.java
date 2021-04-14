package haifeng.cong.leetcode;

/**
 * Description:121. 买卖股票的最佳时机
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/12 9:04
 *
 * @author conghaifeng
 */
public class MaxProfit121 {
    public static void main(String[] args){
        int[] input = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(input));
    }

    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int ans = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            } else {
                if (prices[i] - min > ans) {
                    ans = prices[i] - min;
                }
            }
        }
        return ans;
    }
}
