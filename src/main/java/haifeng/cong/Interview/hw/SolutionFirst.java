package haifeng.cong.Interview.hw;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company:
 * Create Time: 2021/3/23 17:46
 *
 * @author conghaifeng
 */
public class SolutionFirst {

    public static void main(String[] args){
        System.out.println(solveSecond(new int[]{3,2,1,0,4}));
    }

    private static boolean solve(int[] input) {
        boolean[] dp = new boolean[input.length];
        dp[0] = true;
        for (int i = 1; i < input.length; i++) {
            for (int j = 0; j < i; j++) {
                if (dp[j] && input[j] >= i - j) {
                    dp[i] = true;
                }

            }
        }
        return dp[input.length -1];

    }

    private static boolean solveSecond(int[] input) {
        int maxStep = 0;
        for (int i = 0; i < input.length -1; i++) {
            for (int j = i; j < input[i] + i; j++) {
                maxStep = Math.max(maxStep,  i + input[j]);
            }
        }
        return maxStep >= input.length - 1;
    }
}
