package haifeng.cong.hj;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/13 11:05
 *
 * @author conghaifeng
 */
public class HJ92 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            System.out.println(solve(scanner.nextLine()));
        }

    }

    public static String solve(String string) {

        ArrayList<String> list = new ArrayList<>();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {

            while ( i < string.length() && Character.isDigit(string.charAt(i))) {
                stringBuilder.append(string.charAt(i++));
            }

            list.add(stringBuilder.toString());
            stringBuilder.setLength(0);
        }

        int max = 0;
        for (String num : list) {
            max = num.length() > max ? num.length() : max;
        }
        for (String num : list) {
            if (num.length() == max) {
                stringBuilder.append(num);
            }
        }

        return stringBuilder.append(",").append(max).toString();

    }
}
