package haifeng.cong.hj;

import java.util.Scanner;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/13 13:24
 *
 * @author conghaifeng
 */
public class HJ29 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String inputFirst = scanner.next();
            String inputSecond = scanner.next();
            System.out.println(encode(inputFirst));
            System.out.println(decode(inputSecond));
        }
    }

    public static String encode(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                Integer integer = Integer.valueOf(String.valueOf(input.charAt(i)));
                stringBuilder.append((integer + 1) % 10);
            }
            if (Character.isLetter(input.charAt(i))) {
                if (Character.isLowerCase(input.charAt(i))) {
                    char ans = (char) (input.charAt(i) + 1);
                    if (ans > 'z') {
                        stringBuilder.append('A');
                    } else {
                        stringBuilder.append(Character.toUpperCase(ans));
                    }

                } else {
                    char ans = (char) (input.charAt(i) + 1);
                    if (ans > 'Z') {
                        stringBuilder.append('a');
                    } else {
                        stringBuilder.append(Character.toLowerCase(ans));
                    }
                }
            }
        }
        return stringBuilder.toString();
    }

    public static String decode(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                Integer integer = Integer.valueOf(String.valueOf(input.charAt(i)));
                stringBuilder.append((integer + 9) % 10);
            }
            if (Character.isLetter(input.charAt(i))) {
                if (Character.isLowerCase(input.charAt(i))) {
                    char ans = Character.toUpperCase(input.charAt(i));
                    char rest = (char) (ans - 1);
                    if (rest < 'A') {
                        stringBuilder.append('Z');
                    } else {
                        stringBuilder.append(rest);
                    }
                } else {
                    char ans = Character.toLowerCase(input.charAt(i));
                    char rest = (char) (ans - 1);
                    if (rest < 'a') {
                        stringBuilder.append('z');
                    } else {
                        stringBuilder.append(rest);
                    }
                }
            }
        }
        return stringBuilder.toString();
    }

}
