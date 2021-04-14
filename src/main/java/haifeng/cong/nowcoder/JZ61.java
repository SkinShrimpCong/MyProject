package haifeng.cong.nowcoder;

import java.util.HashSet;

/**
 * Description:剑指 Offer 61. 扑克牌中的顺子
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/22 11:38
 *
 * @author conghaifeng
 */
public class JZ61 {

    public static void main(String[] args){
        System.out.println(isStraight(new int[]{1, 2, 3, 4, 5}));
    }

    public static boolean isStraight(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        int max = 0;
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                continue;
            }
            if (set.contains(nums[i])) {
                return false;
            }
            max = Math.max(max, nums[i]);
            min = Math.min(min, nums[i]);
            set.add(nums[i]);
        }
        return max - min < 5;
    }

}
