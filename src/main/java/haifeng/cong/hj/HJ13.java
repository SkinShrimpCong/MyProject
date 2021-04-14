package haifeng.cong.hj;

import java.util.Scanner;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/10 15:11
 *
 * @author conghaifeng
 */
public class HJ13 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        for (int i = strings.length - 1; i >= 0; i--) {
            System.out.print(strings[i] + " ");
        }
    }
}
