package haifeng.cong.hj;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/13 14:04
 *
 * @author conghaifeng
 */
public class HJ24 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();

            int[] high = new int[num];
            for (int i = 0; i < num; i++) {
                high[i] = scanner.nextInt();
            }
            System.out.println(solve(high));
        }

    }

    public static int solve(int[] high) {
        int[] dpLeft = new int[high.length];
        int[] dpRight = new int[high.length];
        Arrays.fill(dpLeft, 1);
        Arrays.fill(dpRight, 1);
        for (int i = 1; i < high.length; i++) {
            for (int j = 0; j < i; j++) {
                if (high[i] > high[j]) {
                    dpLeft[i] = Math.max(dpLeft[i], dpLeft[j] + 1);
                }

            }
        }
        for (int i = high.length - 1; i >= 0; i--) {
            for (int j = high.length - 1; j > i ; j--) {
                if (high[i] > high[j]) {
                    dpRight[i] = Math.max(dpRight[i], dpRight[j] + 1);
                }
            }
        }
        int[] ans = new int[high.length];
        for (int i = 0; i < high.length; i++) {
            ans[i] = dpLeft[i] + dpRight[i] - 1;
        }
        Arrays.sort(ans);
        return high.length - ans[ans.length -1];
    }

    public static int calc(int[] high, int index) {
        int left = index;
        int leftValue = high[index];
        int right = index;
        int rightValue = high[index];
        int ans = 0;
        while (left >= 0) {

            if (leftValue > high[left]) {
                ans++;
                leftValue = high[left];
            }
            left--;
        }
        while (right < high.length) {

            if (rightValue > high[right]) {
                ans++;
                rightValue = high[right];
            }
            right++;
        }
        return ++ans;
    }
}
