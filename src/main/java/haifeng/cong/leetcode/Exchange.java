package haifeng.cong.leetcode;

import java.util.Arrays;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2020/11/3 17:18
 *
 * @author conghaifeng
 */
public class Exchange {

    public static void main(String[] args){

        System.out.println(Arrays.toString(Exchange.exchange(new int[]{1,2,3,4})));
    }

    public static int[] exchange(int[] nums) {
        int first = 0;
        int second = nums.length - 1;
        while(first < second) {
            if (nums[first] % 2 == 1) {
                first++;
                continue;
            }
            if (nums[second] % 2 == 0) {
                second--;
                continue;
            }
            int temp = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;
        }
        return nums;
    }
}
