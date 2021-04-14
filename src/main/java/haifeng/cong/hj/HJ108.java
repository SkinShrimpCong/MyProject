package haifeng.cong.hj;

import java.util.Scanner;

/**
 * Description: 求最小公倍数
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/11 10:53
 *
 * @author conghaifeng
 */
public class HJ108 {


    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int firstNum = scanner.nextInt();
        int secondNum = scanner.nextInt();

        int numReturn = findNum(firstNum, secondNum);
        System.out.println(firstNum * secondNum / numReturn);
    }

    public static int findNum(int firstNum, int secondNum) {
        int ans = 1;
        int min = Math.min(firstNum, secondNum);
        for (int i = 2; i <= min; i++) {
            if (firstNum % i ==0  && secondNum % i == 0) {
                ans *= i;
            }
        }
        return ans;
    }


}
