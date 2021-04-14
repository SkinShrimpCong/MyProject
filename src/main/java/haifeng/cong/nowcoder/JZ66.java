package haifeng.cong.nowcoder;

import java.util.Arrays;

/**
 * Description: 剑指 Offer 66. 构建乘积数组
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/18 22:12
 *
 * @author conghaifeng
 */
public class JZ66 {

    public static void main(String[] args){
        System.out.println(constructArr(new int[]{1,2,3,4,5}));
    }

    public static int[] constructArr(int[] a) {

        int[] b = new int[a.length];
        Arrays.fill(b, 1);
        int tempRight = 1;
        for (int i = 1; i < a.length; i++) {
            tempRight *= a[i - 1];
            b[i] = tempRight;
        }

        int tempLeft = 1;
        for (int i = a.length - 2; i >= 0; i--) {
            tempLeft *= a[i + 1];
            b[i] *= tempLeft;
        }
        return b;
    }
}
