package haifeng.cong.practical;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/5 16:00
 *
 * @author conghaifeng
 */
public class LargeStockPrice {

    public static void main(String[] args){
        int[] temp = {4,2,1,7};

        System.out.println(LargeStockPrice.maxProfit2(temp));
    }

    public static int maxProfit (int[] prices) {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length; i++) {
            //先记录历史最低
            if (prices[i] < min) {
                min = prices[i];
                //后假设每天是在历史低点买入能赚多少
            }

            if (prices[i] - min > maxProfit) {
                maxProfit = prices[i] - min;
            }

        }
        return maxProfit;

    }

    public static int maxProfit2 (int[] prices) {
        int left = 0;
        int right = 0;
        int maxProfit = 0;
        while (left < prices.length && right < prices.length) {
            if (prices[right] < prices[left]) {
                left = right;
                continue;
            }
            if (prices[right] - prices[left] > maxProfit) {
                maxProfit = prices[right] - prices[left];
            }
            right++;
        }
        return maxProfit;
    }
}
