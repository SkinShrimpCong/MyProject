package haifeng.cong.practical;

import java.util.*;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/6 15:21
 *
 * @author conghaifeng
 */
public class SaleFruit {

    public static void main(String[] args){
        int[] m = {4, 2, 6, 4};
        int[] n = {5, 3, 8, 7};
        System.out.println(saleFruit(m, n, 15));
    }

    public static int saleFruit(int[] m, int[] n, int k) {
        int ans = 0;
        TreeMap<Integer, Integer> map = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });

        for (int i = 0; i < m.length; i++) {
            map.put(n[i] - m[i], m[i]);
        }
        Set<Integer> benefit = map.keySet();
        Iterator<Integer> iterator = benefit.iterator();
        return ans - k;
    }
}
