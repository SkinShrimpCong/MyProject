package haifeng.cong.leetcode;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2020/8/19 15:30
 *
 * @author conghaifeng
 */
public class ClimbStairs {

    public int climbStairs(int n) {
        int temp1 = 1;
        int temp2 = 2;
        int result;
        for (int i = 0; i < n-1; i++) {
            result = (temp1 + temp2);
            temp1 = temp2;
            temp2 = result;
        }

        return temp1;
    }
}
