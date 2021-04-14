package haifeng.cong.leetcode;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/17 16:58
 *
 * @author conghaifeng
 */
public class FindReapetLength718 {

    public static void main(String[] args){
        int[] input1 = {1, 2, 3, 2, 1};
        int[] input2 = {3, 2, 1, 4, 7};
        System.out.println(findLength(input1, input2));
    }

    public static int findLength(int[] A, int[] B) {
        if (A.length == 0 || B.length == 0) {
            return 0;
        }
        int[][] dp = new int[A.length][B.length];

        int ans = 0;
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B.length; j++) {

                if (A[i] == B[j]) {
                    if (i == 0 || j == 0) {
                        dp[i][j] = 1;
                    } else {
                        dp[i][j] = 1 + dp[i - 1][j - 1];
                    }
                    ans = Math.max(ans, dp[i][j]);
                }
            }
        }
        return ans;
    }

//    public int findLength2(int[] A, int[] B) {
//        for (int i = 0; i < A.length; i++) {
//
//        }
//    }

}
