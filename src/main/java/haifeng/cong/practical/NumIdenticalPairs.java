package haifeng.cong.practical;

import java.util.HashMap;

/**
 * Description:1512. 好数对的数目
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/3 21:27
 *
 * @author conghaifeng
 */
public class NumIdenticalPairs {

    public int numIdenticalPairs(int[] nums) {
        int flag = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i; j < nums.length ; j++) {
                if (nums[i] == nums[j]) {
                    flag++;
                }
            }

        }
        return flag;
    }

    public int numIdenticalPairs2(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int flag = 0;
        for (int num : nums) {
            Integer cur = map.getOrDefault(num, 0);
            flag+=cur;
            map.put(num, ++cur);
        }
        return flag;
    }
}
