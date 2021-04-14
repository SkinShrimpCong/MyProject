package haifeng.cong.practical;

import java.util.Scanner;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/9 12:44
 *
 * @author conghaifeng
 */
public class CalcCharNum {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String target = scanner.nextLine();
        System.out.println(calcCharNum(s, target));
    }

    public static int calcCharNum(String s, String target) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            if (target.equalsIgnoreCase(String.valueOf(s.charAt(i)))) {
                ans++;
            }
        }
        return ans;
    }
}
