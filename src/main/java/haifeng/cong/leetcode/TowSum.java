package haifeng.cong.leetcode;

import com.google.common.collect.Maps;

import java.util.Arrays;
import java.util.Map;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2020/6/12 9:55
 *
 * @author conghaifeng
 */
public class TowSum {

    public static void main(String[] args){
        int[] array = new int[]{1,2,3,4,5,6,7};
        System.out.print(Arrays.toString(towSum(array, 11)));
    }

    public static int[] towSum(int[] array, int target) {

        if (array.length == 0) {
            return new int[]{};
        }

        Map<Integer, Integer> map = Maps.newHashMap();

        for (int i = 0; i< array.length; ++i) {
            int rest = target - array[i];
            if (map.containsKey(rest)) {
                return new int[] {map.get(rest), i};
            }
            map.put(array[i], i);
        }
        return new int[]{};
    }

}
