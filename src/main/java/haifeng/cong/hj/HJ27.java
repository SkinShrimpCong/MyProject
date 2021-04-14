package haifeng.cong.hj;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/9 14:15
 *
 * @author conghaifeng
 */
public class HJ27 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            ArrayList<String> stingList = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                stingList.add(scanner.next());
            }
            String target = scanner.next();
            int num2 = scanner.nextInt();
            ArrayList<String> ansList = new ArrayList<>();
            for (String string : stingList) {
                if (isBrother(string, target)) {
                    ansList.add(string);
                }
            }
            Collections.sort(ansList);
            System.out.println(ansList.size());
            if (num2 < ansList.size()) {
                System.out.println(ansList.get(num2 - 1));
            }
        }

    }

    public static boolean isBrother(String string, String target) {
        char[] stringChar = string.toCharArray();
        char[] targetChar = target.toCharArray();
        Arrays.sort(stringChar);
        Arrays.sort(targetChar);
        return String.valueOf(stringChar).equals(String.valueOf(targetChar)) && !string.equals(target);
    }


}
