package haifeng.cong.datastructure.sort;

import java.util.Arrays;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/4 9:35
 *
 * @author conghaifeng
 */
public class SelectSort2 {
    public static void main(String[] args) {
        int[] array = {43, 67, 1};

        System.out.println(Arrays.toString(sort(array)));
    }

    public static int[] sort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {

                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
