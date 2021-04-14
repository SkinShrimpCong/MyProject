package haifeng.cong.leetcode;

import java.util.HashMap;

/**
 * Description: 滑动窗口
 * 在覆盖最小窗口的情况下，求最值
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/8 16:48
 *
 * @author conghaifeng
 */
public class TotalFruit {

    public static void main(String[] args){
        int[] tree = {1,0,1,4,1,4,1,2,3};
        System.out.println(totalFruit(tree));
    }

    public static int totalFruit(int[] tree) {

        HashMap<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int left = 0;
        for (int i = 0; i < tree.length; i++) {
            map.put(tree[i], map.getOrDefault(tree[i], 0) + 1);

            while (map.size() > 2) {
                map.put(tree[left], map.getOrDefault(tree[left], 0) - 1);
                if (map.get(tree[left]) == 0) {
                    map.remove(tree[left]);
                }
                left++;
            }

            int cur = 0;
            for (int value : map.values()) {
                cur += value;
            }
            if (max < cur) {
                max = cur;
            }
        }
        return max;
    }
}
