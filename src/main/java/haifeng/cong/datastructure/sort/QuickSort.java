package haifeng.cong.datastructure.sort;

import java.util.Arrays;

/**
 * Description:快速排序（先分后排再分再排，类似于前序遍历）
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/2 10:15
 *
 * @author conghaifeng
 */
public class QuickSort {

    public static void main(String[] args) {
        int[] array = {50,34,1000,4,-65,90};
        singleSideQuickSort(array, 0, array.length - 1);
        System.out.print(Arrays.toString(array));
    }

    private static void singleSideQuickSort(int[] array, int startIndex, int endIndex) {

        if (startIndex > endIndex) {
            return;
        }

        int pivotIndex = partition(array, startIndex, endIndex);
        singleSideQuickSort(array, startIndex, pivotIndex-1);
        singleSideQuickSort(array, pivotIndex+1, endIndex);
    }

    private static int partition(int[] array, int startIndex, int endIndex) {
        int pivot = array[startIndex];
        int mark = startIndex + 1;
        for(int i = startIndex; i <= endIndex; ++i) {
            if (array[i] < pivot) {
                swap(array, i, mark);
                mark++;
            }
        }
        swap(array, startIndex, mark-1);
        return mark-1;
    }

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
