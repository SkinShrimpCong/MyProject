package haifeng.cong.hj;

import java.util.Scanner;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/10 13:43
 *
 * @author conghaifeng
 */
public class HJ95 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String num = scanner.nextLine();
            System.out.println(solve(num));
        }

    }

    public static String solve(String value) {

        String[] num = {"壹", "贰", "叁", "肆", "伍", "陆", "柒", "捌", "玖"};
        String[] unit = {"元", "拾", "佰", "仟", "万", "亿", "角", "分"};

        String[] stringValue = value.split("\\.");
        int intValue = Integer.valueOf(stringValue[0]);
        int floatValue = Integer.valueOf(stringValue[1]);
        StringBuilder stringBuilder = new StringBuilder();

        int flag = 0;
        boolean isTrue = true;
        while (intValue > 0) {
            if (intValue % 10 == 0) {
                if (isTrue) {
                    stringBuilder.append("零");
                }
                isTrue = false;
                intValue /= 10;
                flag++;
            } else {
                isTrue = true;
                stringBuilder.append(unit[flag++]).append(num[intValue % 10 - 1]);
                intValue /= 10;
            }
        }
        stringBuilder.append("币民人");
        stringBuilder.reverse();

        if (floatValue > 0) {
            int first = floatValue / 10;
            int second = floatValue % 10;
            if (first > 0) {
                stringBuilder.append(num[first - 1]).append(unit[6]);
            }
            if (second > 0) {
                stringBuilder.append(num[second - 1]).append(unit[7]);
            }
        } else {
            stringBuilder.append("整");
        }
        return stringBuilder.toString();
    }
}
