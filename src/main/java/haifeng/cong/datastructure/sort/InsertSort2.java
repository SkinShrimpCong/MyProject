package haifeng.cong.datastructure.sort;

import java.util.Arrays;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/4 10:07
 *
 * @author conghaifeng
 */
public class InsertSort2 {

    public static void main(String[] args) {
        int[] array = {43, 67, 1};
        InsertSort2 insertSort = new InsertSort2();
        insertSort.sort(array);
        System.out.println(Arrays.toString(array));
    }

    public int[] sort(int[] array) {

        for (int i = 1; i < array.length; i++) {
            int j = i;
            int temp = array[j];
            while (j > 0 && temp < array[j - 1]) {
                array[j] = array[j - 1];
                j--;
            }
            if (j != i) {
                array[j] = temp;
            }
        }
        return array;
    }
}
