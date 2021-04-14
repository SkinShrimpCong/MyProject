package haifeng.cong.nowcoder;

/**
 * Description: 剑指 Offer 56 - I. 数组中数字出现的次数
 * 一个数和0取亦或还是他本身
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/20 13:48
 *
 * @author conghaifeng
 */
public class JZ56 {

    public int[] singleNumbers(int[] nums) {
        int res = 0;

        for (int num : nums) {
            res ^= num;
        }

        int mask = 1;
        while ((mask & res) == 0) {
            mask <<= 1;
        }
        int ansFirst = 0;
        int ansSecond = 0;
        for (int num : nums) {
            if ((num & mask) == 0) {
                ansFirst ^= num;
            } else {
                ansSecond ^= num;
            }
        }
        return new int[]{ansFirst, ansSecond};
    }
}
