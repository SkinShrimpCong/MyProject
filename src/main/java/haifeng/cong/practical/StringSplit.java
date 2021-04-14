package haifeng.cong.practical;

import java.util.Scanner;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/7 10:56
 *
 * @author conghaifeng
 */
public class StringSplit {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String string = scanner.nextLine();
            String newString = string + "00000000";
            for (int i = 0; i < string.length(); i += 8) {
                System.out.println(newString.substring(i, i + 8));
            }
        }
    }
}
