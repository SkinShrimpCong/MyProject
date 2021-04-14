package haifeng.cong.leetcode;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/9 21:39
 *
 * @author conghaifeng
 */
public class LargestRectangleArea {

    public static void main(String[] args){
        int[] input = {4,2,0,3,2,4,3,4};
        System.out.println(largestRectangleArea(input));
    }

    public static int largestRectangleArea(int[] heights) {
        int left = 0;
        int right = heights.length - 1;
        int ans = (right - left + 1) * findSmall(left, right, heights);
        while (left <= right) {
            if (left < heights.length - 1 && heights[left] < heights[right]) {
                while (heights[left] >= heights[left + 1]) {
                    left++;
                }
                left++;
            } else {
                while (right > 0 &&heights[right] >= heights[right - 1]) {
                    right--;
                }
                right--;
            }
            ans = Math.max(ans, (right - left + 1) * findSmall(left, right, heights));
        }
        return ans;
    }

    public static int findSmall(int left, int right, int[] heights) {
        int min = Integer.MAX_VALUE;
        for (int i = left; i <= right; i++) {
            if (min > heights[i]) {
                min = heights[i];
            }
        }
        return min;
    }

}
