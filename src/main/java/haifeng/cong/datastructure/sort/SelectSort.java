package haifeng.cong.datastructure.sort;

import java.util.Arrays;

public class SelectSort {

    public static void main(String[] args) {
        int[] array = {43, 1, 40};
        SelectSort selectSort = new SelectSort();
        System.out.println(Arrays.toString(selectSort.selectSort(array)));
    }

    public int[] selectSort(int[] array) {
        int size = array.length;
        //i是比较的轮数
        for (int i = 0; i < size - 1; i++) {

            //j是每轮比较的次数
            for (int j = i + 1; j < size; j++) {
                if (array[j] < array[i]) {
                    int min = array[i];
                    array[i] = array[j];
                    array[j] = min;
                }
            }

        }
        return  array;
    }
}
