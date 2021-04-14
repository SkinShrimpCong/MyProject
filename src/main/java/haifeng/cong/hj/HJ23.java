package haifeng.cong.hj;

import java.util.*;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/10 16:24
 *
 * @author conghaifeng
 */
public class HJ23 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String string = scanner.nextLine();
            System.out.println(solve(string));
        }
    }

    public static String solve(String string) {
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < string.length(); i++) {
            map.put(String.valueOf(string.charAt(i)), map.getOrDefault(String.valueOf(string.charAt(i)), 0) + 1);
        }

        Integer times = Integer.MAX_VALUE;
        for (Integer num : map.values()) {
            if (num < times) {
                times = num;
            }
        }
        for (String s : map.keySet()) {
            if (map.get(s).equals(times)) {
                string = string.replace(s, "");
            }
        }
        return string;
    }
}
