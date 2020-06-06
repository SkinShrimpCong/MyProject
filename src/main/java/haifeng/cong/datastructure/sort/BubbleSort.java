package haifeng.cong.datastructure.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void main(String[] args) {
        int[] array = {50,34,1000,4,-65,90};
        BubbleSort sort = new BubbleSort();

        sort.bubbleSort(array);
        System.out.println(Arrays.toString(array));
    }

    public void bubbleSort(int[] array) {
        int size = array.length;
        for (int i = 0; i<size; ++i) {
            boolean flag = false;
            for (int j = 0; j < size-i-1; ++j) {
                if (array[j] > array[j+1]) {
                    changeArray(array, j);
                    flag = true;
                }
            }
            if (!flag) break;
        }
    }

    private void changeArray(int[] array, int position) {
        int temp;
        temp = array[position+1];
        array[position+1] = array[position];
        array[position] = temp;
    }
}
