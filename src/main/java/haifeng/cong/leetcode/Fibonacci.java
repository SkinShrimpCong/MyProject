package haifeng.cong.leetcode;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2020/8/19 14:36
 *
 * @author conghaifeng
 */
public class Fibonacci {

    public static int fibonacci(int n) {
        int temp1 = 0;
        int temp2 = 1;
        int result;
        for (int i = 0; i < n; i++) {
            result = (temp1 + temp2) % 1000000007;
            temp1 = temp2;
            temp2 = result;
        }

        return temp1;
    }

    public static void main(String[] args){
        System.out.println(fibonacci(48));
    }
}
