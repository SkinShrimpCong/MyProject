package haifeng.cong.leetcode;

/**
 * Description:714. 买卖股票的最佳时机含手续费
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/12 9:27
 *
 * @author conghaifeng
 */
public class MaxProfit714 {

    public static void main(String[] args){
        int[] input = {1,3,7,5,10,3};
        System.out.println(maxProfit(input, 3));
    }

    public static int maxProfit(int[] prices, int fee) {
        int ans = 0;
        int buy = prices[0] + fee;
        for (int i = 0; i < prices.length; i++) {
            if (buy > prices[i] + fee) {
                buy = prices[i] + fee;
            } else if (buy < prices[i]) {
                ans = ans + prices[i] - buy;
                buy = prices[i];
            }
        }
        return ans;
    }
}
