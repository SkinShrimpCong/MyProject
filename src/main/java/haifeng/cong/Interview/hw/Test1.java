package haifeng.cong.Interview.hw;

import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/13 18:05
 *
 * @author conghaifeng
 */
public class Test1 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            System.out.println(solve(input));
        }

    }

    public static String solve(String input) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        StringBuilder stringBuilder = new StringBuilder();
        int num = 0;
        String ans = "";
        for (int i = 0; i < input.length(); i++) {
            if (Character.isDigit(input.charAt(i))) {
                stringBuilder.append(input.charAt(i));
            } else if (input.charAt(i) == '+' || input.charAt(i) == '-'){
                if (stringBuilder.length() > 0) {
                    if (stringBuilder.length() > num) {
                        num = stringBuilder.length();
                        ans = stringBuilder.toString();
                    }
                    stringBuilder.setLength(0);
                    stringBuilder.append(input.charAt(i));
                    continue;
                }
            } else if (input.charAt(i) == '.' && i > 0 && i < input.length() -1 ) {
                if (Character.isDigit(input.charAt(i - 1)) && Character.isDigit(input.charAt(i + 1)) ) {
                    stringBuilder.append(input.charAt(i));
                }
            }
        }
        if (stringBuilder.length() >= num) {
            ans = stringBuilder.toString();
        }
        int flag = 0;
        if (ans.contains(".")) {
            String[] split = ans.split("\\.");
            for (int i = 0; i < split.length - 2; i++) {
                if ((split[i].length() + split[i + 1].length()) > (split[i + 1].length() + split[i + 2].length())) {
                    flag = i;
                }
            }
            ans = split[flag] + "." + split[flag + 1];
        }
        return ans;
    }
}
