package haifeng.cong.hj;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * Description: 千万要注意循环处理
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/12 14:10
 *
 * @author conghaifeng
 */
public class HJ94 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()) {
            HashMap<String, Integer> map = new LinkedHashMap<>();
            int Invalid = 0;
            int personNum = scanner.nextInt();
            for (int i = 0; i < personNum; i++) {
                map.put(scanner.next(), 1);
            }
            int ticketNum = scanner.nextInt();
            for (int i = 0; i < ticketNum; i++) {
                String personName = scanner.next();
                Integer integer = map.getOrDefault(personName, 0);
                if (integer == 0) {
                    Invalid++;
                    continue;
                }
                map.put(personName, ++integer);
            }
            for (String personName : map.keySet()) {
                int ticket= map.get(personName) - 1;
                System.out.println(personName + " : " + ticket);
            }
            System.out.println("Invalid : " + Invalid);
        }
    }
}
