package haifeng.cong.datastructure.sort;

import java.util.Arrays;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/1 17:59
 *
 * @author conghaifeng
 */
public class InsertSort {

    public static void main(String[] args) {
        int[] array = {43, 67, 1};
        InsertSort insertSort = new InsertSort();
        insertSort.insertSort(array);
        System.out.println(Arrays.toString(array));
    }

    public void insertSort(int[] array) {
        int length = array.length;

        //i从1开始，当一张牌（0）摸在手里的时候默认有序   // 从下标为1的元素开始选择合适的位置插入，因为下标为0的只有一个元素，默认是有序的
        for (int i = 1; i < length; i++) {
            // 记录要插入的数据
            int temp = array[i];
            // 从已经排序的序列最右边的开始比较，找到比其小的数
            int j = i;
            while (j > 0 && temp < array[j-1]) {
                //将
                array[j] = array[j - 1];
                j--;
            }
            if (j < i) {
                array[j] = temp;
            }
        }
    }
}
