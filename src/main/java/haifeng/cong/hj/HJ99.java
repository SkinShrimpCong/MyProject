package haifeng.cong.hj;

import java.util.Scanner;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/12 13:45
 *
 * @author conghaifeng
 */
public class HJ99 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            System.out.println(solve(input));
        }
        System.out.println(Integer.valueOf("10", 16));
    }

    public static int solve(int input) {
        int ans = 0;
        for (int i = 0; i <= input; i++) {
            if (isTrue(i)) {
                ans++;
            }
        }
        return ans;
    }

    public static boolean isTrue(int num) {
        int powNum = (int) Math.pow(num, 2);
        String powNumString = String.valueOf(powNum);
        String numString = String.valueOf(num);
        for (int i = 0; i < numString.length(); i++) {
            if (numString.charAt(numString.length() - 1 - i) != powNumString.charAt(powNumString.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
}
