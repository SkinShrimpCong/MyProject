package haifeng.cong.nowcoder;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/20 14:50
 *
 * @author conghaifeng
 */
public class JZ14 {

    public int cuttingRope(int n) {
        int[] dp = new int[n + 1];
        dp[2] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 2; j < i; j++) {
                dp[i] = Math.max(dp[i], Math.max((i-j) * j, j * dp[i-j]));
            }
        }
        return dp[n];

    }
}
