package haifeng.cong.nowcoder;

/**
 * Description:剑指 Offer 49. 丑数
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/18 22:35
 *
 * @author conghaifeng
 */
public class JZ49 {

    public static void main(String[] args){
        System.out.println(nthUglyNumber(12));
    }

    public static int nthUglyNumber(int n) {
        int[] dp = new int[n];
        dp[0] = 1;
        int IndexFirst = 0;
        int Indexsecond = 0;
        int Indexthird = 0;

        for (int i = 1; i < n; i++) {
            int first = dp[IndexFirst] * 2;
            int second = dp[Indexsecond] * 3;
            int third = dp[Indexthird] * 5;
            dp[i] = Math.min(first, Math.min(second, third));
            if (first == dp[i]) {
                IndexFirst++;
            }
            if (second == dp[i]) {
                Indexsecond++;
            }
            if (third == dp[i]) {
                Indexthird++;
            }
        }
        return dp[n -1];
    }
}
