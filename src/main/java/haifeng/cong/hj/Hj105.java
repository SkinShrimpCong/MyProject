package haifeng.cong.hj;

import java.util.Scanner;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/9 15:06
 *
 * @author conghaifeng
 */
public class Hj105 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int firstNum = 0;
        int secondNum = 0;
        double ans = 0;
        while (scanner.hasNext()) {
            int input = scanner.nextInt();
            if (input < 0) {
                firstNum++;
            } else {
                ans+=input;
                secondNum++;
            }
        }
        double output = secondNum == 0? 0: ans / secondNum;
        System.out.println(firstNum);
        System.out.println(String.format("%.1f", output));

    }

}
