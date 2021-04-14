package haifeng.cong.hj;

import java.util.Scanner;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/10 14:12
 *
 * @author conghaifeng
 */
public class HJ5 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            System.out.println(solve(input));
        }
    }

    public static int solve(String input) {
        int[] unit = {10, 11, 12, 13, 14, 15};
        int[] output = new int[input.length() - 2];

        for (int i = 2; i < input.length(); i++) {
            if (input.charAt(i) >= 'A') {
                output[i - 2] = unit[input.charAt(i) - 'A'];
            } else {
                output[i - 2] = input.charAt(i) - '0';
            }
        }
        int ans = 0;
        for (int i = 0; i < input.length() - 2; i++) {
            ans = ans *16 + output[i];
        }
        return ans;
    }

    public static int solve2(String input) {
        return Integer.valueOf(input.substring(2, input.length()), 16);
    }
}
