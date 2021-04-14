package haifeng.cong.hj;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/12 11:13
 *
 * @author conghaifeng
 */
public class HJ51 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            LinkedList<Integer> list = new LinkedList<>();
            for (int i = 0; i < num; i++) {
                list.offer(scanner.nextInt());
            }
            int num2 = scanner.nextInt();
            if (num2 == 0) {
                System.out.println(0);
            } else {
                for (int i = 0; i < num2 - 1; i++) {
                    list.pollLast();
                }
                System.out.println(list.pollLast());
            }

        }

    }
}
