package haifeng.cong.nowcoder;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/18 15:58
 *
 * @author conghaifeng
 */
public class JZ67 {

    public static void main(String[] args){
        System.out.println(strToInt("2147483648"));
    }

    public static int strToInt(String str) {
        int sign = 1;
        if(str.length() == 0){
            return 0;
        }
        int i = 0;
        while (str.charAt(i) == ' ') {
            i++;
            if (i == str.length()) {
                return 0;
            }
        }


        if (str.charAt(i) == '-') {
            sign = -1;
        }
        if (str.charAt(i) == '+' || str.charAt(i) == '-') {
            i++;
        }

        int limit = Integer.MAX_VALUE / 10;
        int ans = 0;
        for (int j = i; j < str.length(); j++) {
            if (Character.isDigit(str.charAt(j))) {
                if (ans > limit || (ans == limit && str.charAt(j) > '7')) {
                    return sign > 0 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
                }
                ans = ans * 10 + str.charAt(j) - '0';
            } else {
                break;
            }
        }

        return sign * ans;

    }
}
