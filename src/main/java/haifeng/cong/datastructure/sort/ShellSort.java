package haifeng.cong.datastructure.sort;

import java.util.Arrays;

/**
 * Description:希尔排序
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/2 15:00
 *
 * @author conghaifeng
 */
public class ShellSort {

    public static void main(String[] args) {
        int[] array = {50,34,1000,4,-65,90};
        shellSort(array);
        System.out.print(Arrays.toString(array));
    }

    public static void shellSort(int[] array) {
        //增量gap，并逐步缩小增量
        for (int gap = array.length/2; gap > 0 ; gap/=2) {

            //从第gap个元素开始,逐个对其所在组的元素进行插入排序。
            for (int i = gap; i < array.length; i++) {
                //移动法
                int j = i;
                int temp = array[j];
                while (j - gap >= 0 && temp < array[j - gap]) {
                    array[j] = array[j - gap];
                    j -= gap;
                }
                array[j] = temp;
            }
        }
    }
}
