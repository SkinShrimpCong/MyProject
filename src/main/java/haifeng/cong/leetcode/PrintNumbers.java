package haifeng.cong.leetcode;

import java.util.Arrays;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2020/9/3 18:08
 *
 * @author conghaifeng
 */
public class PrintNumbers {

    public int[] printNumbers(int n) {
        int max = (int) Math.pow(10, n) - 1;
        int[] out = new int[max];
        for (int i = 1; i <= max; i++) {
            out[i-1]= i;
        }
        return out;
    }

    public static void main(String[] args){
        PrintNumbers printNumbers = new PrintNumbers();
        System.out.println(Arrays.toString(printNumbers.printNumbers(1)));
    }

}
