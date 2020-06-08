package haifeng.cong.datastructure.sort;

import java.util.Arrays;

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
        int mark = startIndex;
        for(int i = startIndex; i <= endIndex; ++i) {
            if (array[i] < pivot) {
                ++ mark;
                swap(array, i, mark);
            }
        }
        swap(array, startIndex, mark);
        return mark;
    }

    private static void swap(int[] array, int firstIndex, int secondIndex) {
        int temp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = temp;
    }
}
