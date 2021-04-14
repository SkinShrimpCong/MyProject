package haifeng.cong.hj;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/10 15:18
 *
 * @author conghaifeng
 */
public class HJ20 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            if (isOk(scanner.nextLine())) {
                System.out.println("OK");
            } else {
                System.out.println("NG");
            }
        }
    }

    public static boolean isOk(String string) {
        if (string.length() <= 8) {
            return false;
        }
        if (!getMatcher(string)) {
            return false;
        }
        if (hasSame(string, 0, 3)) {
            return false;
        }

        return true;
    }

    public static boolean getMatcher(String string) {
        Pattern pattern = Pattern.compile("[0-9]");
        int count = 0;
        if (pattern.matcher(string).find()) {
            count++;
        }
        Pattern pattern2 = Pattern.compile("[a-z]");
        if (pattern2.matcher(string).find()) {
            count++;
        }
        Pattern pattern3 = Pattern.compile("[A-Z]");
        if (pattern3.matcher(string).find()) {
            count++;
        }
        Pattern pattern4 = Pattern.compile("[^0-9a-zA-Z]");
        if (pattern4.matcher(string).find()) {
            count++;
        }
        return count >= 3;
    }

    public static boolean hasSame(String string, int left, int right) {
        if (right >= string.length()) {
            return false;
        }
        if (string.substring(right).contains(string.substring(left, right))) {
            return true;
        }
        return hasSame(string, ++left, ++right);
    }
}
