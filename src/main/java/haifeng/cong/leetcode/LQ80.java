package haifeng.cong.leetcode;

/**
 * Description:  80.删除有序数组中的重复项 II
 * Copyright: Copyright (c) 2021
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/4/6 10:53
 *
 * @author conghaifeng
 */
public class LQ80 {

    public static void main(String[] args) {
        System.out.println(removeDuplicates2(new int[]{1,1,1,2,2,3}));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length < 3) {
            return nums.length;
        }
        int pre = 0;
        int cur = 2;
        int len = nums.length;
        while (cur < len) {
            if (nums[pre] == nums[cur]) {
                for (int i = cur; i < len - 1; i++) {
                    nums[i] = nums[i + 1];
                }
                len--;

            } else {
                cur++;
                pre++;
            }
        }
        return len;
    }


    public static int removeDuplicates2(int[] nums) {
        if (nums.length < 3) {
            return nums.length;
        }
        int pre = 2;
        int cur = 2;
        while (cur < nums.length) {
            if (nums[pre - 2] != nums[cur]) {
                nums[pre] = nums[cur];
                pre++;
            }
            cur++;
        }
        return pre;
    }
}
