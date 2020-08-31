package haifeng.cong.leetcode;

/**
 * Description: 剑指 Offer 15. 二进制中1的个数
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2020/8/26 11:26
 *
 * @author conghaifeng
 */
public class HammingWeight {

    public int hammingWeight(int n) {
        int res = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                res++;
            }
            n = n >>> 1;
        }
        return res;
    }


}
