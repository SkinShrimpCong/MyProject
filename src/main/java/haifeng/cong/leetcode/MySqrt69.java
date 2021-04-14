package haifeng.cong.leetcode;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/10 23:35
 *
 * @author conghaifeng
 */
public class MySqrt69 {

    public static void main(String[] args){
        System.out.println(mySqrt(345236576));
    }

    public static int mySqrt(int x) {
        int left = 0;
        int right = x;

        int ans = -1;
        while (left <= right) {
            int mid =left + (right - left) / 2;
            if (Math.pow(mid, 2) > x) {
                right = mid - 1;
            } else {
                ans = mid;
                left = mid + 1;
            }
        }
        return ans;

    }
}

