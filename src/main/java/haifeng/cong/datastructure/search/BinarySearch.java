package haifeng.cong.datastructure.search;

/**
 * Description: 二分查找
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2020/6/9 13:50
 *
 * @author conghaifeng
 */
public class BinarySearch {

    public static void main(String[] args){
        int[] array = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("8的下标是：" + binarySearch(array, 8));
        System.out.println("0的下标是：" + binarySearch(array, 0));
    }

    public static Integer binarySearch(int array[], int target) {
        int endIndex = array.length - 1;
        int startIndex = 0;
        while (startIndex <= endIndex) {
            int mid = (endIndex + startIndex) >> 1;
            if (array[mid] == target) {
                return mid;
            }
            if (array[mid] > target) {
                endIndex = mid - 1;
            } else {
                startIndex = mid + 1;
            }
        }
        return null;
    }
}
