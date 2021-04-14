package haifeng.cong.nowcoder;

import java.util.Arrays;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/20 14:06
 *
 * @author conghaifeng
 */
public class JZ40 {

    public static void main(String[] args){
        getLeastNumbers(new int[]{3,2,1}, 2);
    }

    public static int[] getLeastNumbers(int[] arr, int k) {
        int[] outPut = new int[k];
        Arrays.fill(outPut, Integer.MAX_VALUE);
         for (int j = 0; j < k; j++){
             for (int i = 1; i <= arr.length; i++) {
                if (outPut[j] > arr[i - 1]) {
                    int temp = outPut[j];
                    outPut[j] = arr[i - 1];
                    arr[i - 1] = temp;
                }

            }
        }
        return outPut;
    }
}
