package haifeng.cong.leetcode;

/**
 * Description: 88. 合并两个有序数组
 * Copyright: Copyright (c) 2021
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/4/5 10:13
 *
 * @author conghaifeng
 */
public class LQ88 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int first = 0;
        int second = 0;
        int flag = 0;
        int[] ans = new int[n + m];
        while (first < m && second < n) {
            if (nums1[first] < nums2[second]) {
                ans[flag++] = nums1[first++];
            } else {
                ans[flag++] = nums2[second++];
            }
        }
        while (first < m) {
            ans[flag++] = nums1[first++];
        }

        while (second < n) {
            ans[flag++] = nums2[second++];
        }
        for (int i = 0; i < n + m; i++) {
            nums1[i] = ans[i];
        }
    }
}
