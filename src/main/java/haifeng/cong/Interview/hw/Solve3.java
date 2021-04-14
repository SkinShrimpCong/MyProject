package haifeng.cong.Interview.hw;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/14 15:36
 *
 * @author conghaifeng
 */
public class Solve3 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        ArrayList<String> list = new ArrayList<>();
        String[] splitString = input.split("[0-9]");
        String[] splitNum = input.split("[a-zA-Z]");

        for (int i = 0; i < splitString.length; i++) {
            if (!splitString[i].equals("")) {
                StringBuilder stringBuilder = new StringBuilder();
                for (int j = 0; j < Integer.valueOf(splitNum[i + 1]); j++) {
                    stringBuilder.append(splitString[i]);
                }
                list.add(stringBuilder.toString());
            }
        }
        list.sort(Comparator.naturalOrder());
        list.sort(Comparator.comparing(String::length));
        StringBuilder stringBuilder = new StringBuilder();
        for (String string : list) {
            stringBuilder.append(string);
        }
        System.out.println(stringBuilder.toString());
    }
}
