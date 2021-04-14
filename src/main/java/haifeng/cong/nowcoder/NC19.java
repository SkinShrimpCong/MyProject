package haifeng.cong.nowcoder;

import java.beans.Transient;

/**
 * Description:子数组的最大累加和问题
 * 动态规划
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/16 15:32
 *
 * @author conghaifeng
 */
public class NC19 {

    private int test = 1;

    @Transient
    public int getTest() {
        return test;
    }
    @Transient
    public void setTest(int test) {
        this.test = test;
    }

    public int maxsumofSubarray (int[] arr) {

        int max = arr[0];
        int[] dp = new int[arr.length];
        dp[0] = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (dp[i - 1] > 0) {
                dp[i] = dp[i - 1] + arr[i];
            } else {
                dp[i] = arr[i];
            }
            max = Math.max(dp[i], max);
        }
        return max;

    }

}
