package haifeng.cong.leetcode;

import java.util.Arrays;

/**
 * Description:300. 最长递增子序列
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/10 10:06
 *
 * @author conghaifeng
 */
public class LongestConsecutive300 {

    public static void main(String[] args){
        int[] input = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(input));
    }

    public static int longestConsecutive(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp, 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }

            }
            
        }
        Arrays.sort(dp);
        return dp[dp.length - 1];
    }
}
