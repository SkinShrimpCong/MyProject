package haifeng.cong.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2020/8/17 18:05
 *
 * @author conghaifeng
 */
public class RepeatNumber {

    public static int findRepeatNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (!set.add(i)) {
                return  i;

            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] nums = new int[]{2, 3, 1, 0, 2, 5, 3};
        System.out.println(findRepeatNumber(nums));
    }

}
