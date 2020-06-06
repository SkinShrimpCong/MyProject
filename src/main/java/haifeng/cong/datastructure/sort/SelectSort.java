package haifeng.cong.datastructure.sort;

import java.util.Arrays;

public class SelectSort {

    public static void main(String[] args) {
        int[] array = {43, 67, 1};
        SelectSort selectSort = new SelectSort();
        System.out.println(Arrays.toString(selectSort.selectSort(array)));
    }

    public int[] selectSort(int[] array) {
        int size = array.length;
        for (int i = 1; i<size; ++i) {
            int value = array[i];
            int j = i-1;
            for (; j>=0; --j) {
                if (array[j] > value) {
                    array[j+1] = array[j];
                } else {
                    break;
                }
            }
            //插入,因为最后一次循环出来的时候将j减了1
            array[j+1] = value;
        }
        return array;
    }
}
