package haifeng.cong.hj;

import java.util.Scanner;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/9 17:11
 *
 * @author conghaifeng
 */
public class HJ39 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String[] mask = scanner.nextLine().split("\\.");
            String[] ipFirst = scanner.nextLine().split("\\.");
            String[] ipSecond = scanner.nextLine().split("\\.");
            int[] maskNum = changeToNum(mask);
            int[] ipFirstNum = changeToNum(ipFirst);
            int[] ipSecondNum = changeToNum(ipSecond);
            if (isMask(maskNum) && isCorrect(maskNum) && isCorrect(ipFirstNum) && isCorrect(ipSecondNum)) {
                if (isSame(maskNum, ipFirstNum, ipSecondNum)) {
                    System.out.println(0);
                } else {
                    System.out.println(2);
                }
            } else {
                System.out.println(1);
            }
        }
    }

    public static int[] changeToNum(String[] strings) {
        int[] integers = new int[strings.length];
        for (int i = 0; i < strings.length; i++) {
            integers[i] = Integer.valueOf(strings[i]);
        }
        return integers;
    }

    public static boolean isCorrect(int[] num) {
        for (int i = 0; i < num.length; i++) {
            if (num[i] < 0 || num[i] > 255 ) {
                return false;
            }
        }
        return true;
    }

    public static boolean isMask(int[] num) {
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] < num[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSame(int[] maskNum, int[] ipFirstNum, int[] ipSecondNum) {
        for (int i = 0; i < maskNum.length; i++) {
            if ((maskNum[i] & ipFirstNum[i]) != (maskNum[i] & ipSecondNum[i])) {
                return false;
            }
        }
        return true;
    }
}
