package haifeng.cong.datastructure.sort;

import java.util.Arrays;

/**
 * Description:归并排序（先分后排再合并，类似于后续遍历）
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/2 10:15
 *
 * @author conghaifeng
 */
public class MergeSort {

    public static void main(String[] args) {
        int[] array = {50,34,1000,4,-65,90};
        mergeSort(array);
        System.out.print(Arrays.toString(array));
    }

    public static void mergeSort(int[] array) {
        int length = array.length;
        sort(array, 0, length - 1, new int[length]);
    }

    public static void sort(int[] arr, int left, int right, int[] temp) {
        if (left < right) {
            int middle = (left + right) / 2;
            sort(arr, left, middle, temp);
            sort(arr, middle + 1, right, temp);
            merge(arr, left, middle, right, temp);
        }
    }

    public static void merge(int[] arr, int left, int middle, int right, int[] temp) {
        int t = 0;//临时数组指针
        int l = left;//左序列指针
        int r = middle + 1;//右序列指针
        while (l <= middle && r <= right) {
            if (arr[r] < arr[l]) {
                temp[t++] = arr[r++];
            } else {
                temp[t++] = arr[l++];
            }
        }
        while (l <= middle) {
            temp[t++] = arr[l++];
        }
        while (r <= right) {
            temp[t++] = arr[r++];
        }
        //将temp中的元素全部拷贝到原数组中
        t = 0;
        while (left <= right) {
            arr[left++] = temp[t++];
        }
    }

}
