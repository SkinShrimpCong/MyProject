package haifeng.cong.datastructure.Dynamic;

/**
 * Description: 背包问题，动态规划解法
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2020/6/23 16:37
 *
 * @author conghaifeng
 */
public class Knapsack2 {

    public static void main(String[] args){

    }

    private static int knapsack(int[] items, int weight) {
        int itemNum = items.length;
        boolean[] states = new boolean[weight];
        states[0] = true;

        if (items[0] < weight) {
            states[weight] = true;
        }

        for (int i = 0; i < itemNum; i++) {
            for (int j = weight - items[i]; j >= 0; --j) {
                if (states[j] == true) {
                    states[j + items[i]] = true;
                }
            }
        }

        for (int i = weight -1; i >= 0; i--) {
            if (states[i]) {
                return i;
            }
        }
        return 0;
    }
}
