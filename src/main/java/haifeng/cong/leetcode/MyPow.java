package haifeng.cong.leetcode;

/**
 * Description: 剑指 Offer 16. 数值的整数次方
 * 实现函数double Power(double base, int exponent)，求base的exponent次方。不得使用库函数，同时不需要考虑大数问题。
 *
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2020/9/1 14:01
 *
 * @author conghaifeng
 */
public class MyPow {

    public double myPow(double x, int n) {

        double res = 1;
        long index = n;

        if (index < 0) {
            x = 1 / x;
            index = -index;
        }

        while (index > 0) {
            if ((index & 1) == 1) {
                res = res * x;
            }
            x = x * x;
            index = index >> 1;
        }
        return res;
    }

    public static void main(String[] args){
        MyPow myPow = new MyPow();
        System.out.println(myPow.myPow(200000, -2147483648));
    }

}
