package haifeng.cong.datastructure.sort;

import java.util.Arrays;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/4 10:15
 *
 * @author conghaifeng
 */
public class QuickSort2 {


    public static void main(String[] args) {
        int[] array = {50,34,1000,4,-65,90};
        quickSort(array);
        System.out.print(Arrays.toString(array));
    }

    private static void quickSort(int[] array) {

        sort(array, 0, array.length - 1);
    }

    private static void sort(int[] array, int left, int right) {
        if (left > right) {
            return;
        }
        int partition = partition(array, left, right);
        sort(array, left, partition - 1);
        sort(array, partition + 1, right);

    }

    private static int partition(int[] array, int left, int right) {
        int pivot = array[left];
        int mark = left + 1;
        for (int i = left + 1; i <= right; i++) {
            if (array[i] < pivot) {
                swap(array, mark, i);
                mark++;
            }
        }
        swap(array, left, mark - 1);
        return mark - 1;
    }


    private static void swap(int[] array, int first, int second) {
        int temp = array[first];
        array[first] = array[second];
        array[second] = temp;
    }



















}
