package haifeng.cong.nowcoder;

/**
 * Description: 剑指 Offer 42. 连续子数组的最大和
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/19 14:54
 *
 * @author conghaifeng
 */
public class JZ42 {
    public int maxSubArray(int[] nums) {
        int ans = 0;
        for (int i = 0; i < nums.length - 1; i++) {

            if (nums[i] > 0) {
                nums[i + 1] += nums[i];

            }
            ans = Math.max(ans, nums[i + 1]);
        }
        return ans;
    }
}
