package haifeng.cong.leetcode;

/**
 * Description:55. 跳跃游戏
 * 动态规划
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/21 9:52
 *
 * @author conghaifeng
 */
public class LQ55 {

    public static void main(String[] args){
        System.out.println(canJump(new int[]{3,2,1,0,4}));
    }

    public static boolean canJump(int[] nums) {

        boolean[] dp = new boolean[nums.length];
        dp[0] = true;
        for (int i = 1; i < nums.length; i++) {
            for (int j = 0; j <= i; j++) {
                if (dp[j] && nums[j] >= i - j) {
                    dp[i] = true;
                    break;
                }

            }
        }
        return dp[nums.length - 1];
    }
}
