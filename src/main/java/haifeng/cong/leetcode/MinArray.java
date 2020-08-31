package haifeng.cong.leetcode;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2020/8/19 15:39
 *
 * @author conghaifeng
 */
public class MinArray {

    public int minArray(int[] numbers) {
        int result = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (result > numbers[i]) {
                result = numbers[i];
            }
        }
        return result;
    }

    //寻找最小值，numbers[pivot]较小的时候可能为最小值，numbers[pivot]较大的时候不可能为最小值
    public int minArray2(int[] numbers) {
        int low = 0;
        int high = numbers.length - 1;
        while (low < high) {
            int pivot = low + (high - low) /2;
            if (numbers[high] < numbers[pivot]) {
                low = pivot + 1;
                continue;
            }
            if (numbers[high] > numbers[pivot]) {
                high = pivot;
                continue;
            }
            high--;
        }
        return numbers[low];
    }
}
