package haifeng.cong.hj;

import java.util.Scanner;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/10 14:43
 *
 * @author conghaifeng
 */
public class HJ6 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        for (int i = 2; i <= input; i++) {
            while (input % i == 0) {
                input /= i;
                System.out.print(i + " ");
            }
        }
    }
}
