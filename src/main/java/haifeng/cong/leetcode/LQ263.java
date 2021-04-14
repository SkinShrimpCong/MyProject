package haifeng.cong.leetcode;

/**
 * Description: 丑数
 *
 * 给你一个整数 n ，请你判断 n 是否为 丑数 。如果是，返回 true ；否则，返回 false 。
 *
 * 丑数 就是只包含质因数 2、3 和/或 5 的正整数。
 * Copyright: Copyright (c) 2021
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/4/10 0:37
 *
 * @author conghaifeng
 */
public class LQ263 {

    public static void main(String[] args) {
        System.out.println(isUgly(14));
    }

    public static boolean isUgly(int n) {

        while (n % 2 == 0) {
            n /= 2;
        }
        while (n % 3 == 0) {
            n /= 3;
        }
        while (n % 5 == 0) {
            n /= 5;
        }

        return n == 1;

    }
}
