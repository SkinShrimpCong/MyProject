package haifeng.cong.practical;

import java.util.ArrayList;
import java.util.Scanner;
/**
* StringBuilder.setLength(0),可以进行清空；可以使用内部循环
* */

public class LargeNumString {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        LargeNumString largeNumString = new LargeNumString();
        while (scanner.hasNext()) {
            System.out.println(largeNumString.solve(scanner.nextLine()));
        }

    }

    public String solve(String string) {

        ArrayList<String> list = new ArrayList<>();

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {

            while (i < string.length() && string.charAt(i) <= '9' && string.charAt(i) >= '0') {
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
