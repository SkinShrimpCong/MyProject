package haifeng.cong.leetcode;

/**
 * Description: 415. 字符串相加
 * 1.利用Ascii码直接做字符加减
 * 2.完成加法后要反转字符串
 * 3.字符串添加时取余10，获取个位
 * 4.重置进位时除10，获取十位
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/1/5 21:36
 *
 * @author conghaifeng
 */
public class TwoStringSum {

    public static String addStrings(String num1, String num2) {
        StringBuilder stringBuilder = new StringBuilder();
        int add = 0, i = num1.length() - 1, j = num2.length() - 1;
        while (i >= 0 || j >= 0 || add != 0) {
            if (i >= 0) {
                add = add + num1.charAt(i) - '0';
            }
            if (j >= 0) {
                add = add + num2.charAt(j) - '0';
            }
            stringBuilder.append(add%10);
            add/=10;
            i--;
            j--;
        }
        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    public static void main(String[] args){
        System.out.println(addStrings("111111111111111", "1111111111111111111111111111111113"));
    }


}
