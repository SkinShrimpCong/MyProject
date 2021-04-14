package haifeng.cong.hj;

import java.util.Scanner;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/11 15:40
 *
 * @author conghaifeng
 */
public class HJ107 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double input = scanner.nextDouble();
        boolean flag=false;
        if(input<0) {
            flag=true;
            input=-input;
        }

        double left = 0;
        double right = input;
        if (input < 1) {
            right = 1;
        }
        while (right - left > 0.001) {
            double mid = left + (right - left) / 2;
            if ((mid * mid * mid) > input) {
                right = mid;
            } else {
                left = mid;
            }
        }
        if(flag) {
            right=0-right;
        }
        System.out.println(String.format("%.1f", right));
    }
}
