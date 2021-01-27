package haifeng.cong.leetcode;

/**
 * Description: 43. 字符串相乘
 * 1.两数相乘位数小于等于两个数的位数之和，建立一个长度为两数位数之和的数组，用来存储结果
 * 2.利用Ascii码将字符和‘0’相减直接获取值
 * 3.先相加后处理进位
 * 4.最后输出的时候
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/1/5 22:03
 *
 * @author conghaifeng
 */
public class TwoStringMutiply {

    public static String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) {
            return "0";
        }
        int ans[] = new int[num1.length() + num2.length()];

        for (int i = num2.length() - 1; i >= 0; --i) {
            for (int j = num1.length() - 1; j >= 0; --j) {
                int first = num2.charAt(i) - '0';
                int second = num1.charAt(j) - '0';
                ans[i + j + 1] = ans[i + j + 1] + first * second;//ans 数组的最后一位下标为i+j+1，该数组的长度为i+j+2
            }
        }

        //对数组进行进位处理
        for (int k = ans.length - 1; k > 0; k--) {
            ans[k-1] = ans[k-1] + ans[k] / 10;
            ans[k] = ans[k] % 10;
        }

        //将数组转为字符串输出
        int flag = ans[0] == 0 ? 1 : 0;
        StringBuilder stringBuilder = new StringBuilder();
        for(int a = flag; a < ans.length; a++) {
            stringBuilder.append(ans[a]);
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args){
        System.out.println(multiply("0", "0"));
    }
}
