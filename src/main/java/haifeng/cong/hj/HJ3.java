package haifeng.cong.hj;

import java.util.Scanner;
import java.util.TreeSet;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/9 12:55
 *
 * @author conghaifeng
 */
public class HJ3 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            TreeSet<Integer> set = new TreeSet<>();
            int num = scanner.nextInt();
            for (int i = 0; i < num; i++) {
                set.add(scanner.nextInt());
            }
            for (Integer out : set) {
                System.out.println(out);
            }
        }


    }

}
