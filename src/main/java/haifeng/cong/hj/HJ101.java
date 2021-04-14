package haifeng.cong.hj;

import java.util.*;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/11 21:39
 *
 * @author conghaifeng
 */
public class HJ101 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int num = scanner.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int i = 0; i < num; i++) {
                list.add(scanner.nextInt());
            }
            int sort = scanner.nextInt();
            if (sort == 0) {
                Collections.sort(list);
                for (Integer out : list) {
                    System.out.println(out + " ");
                }
                System.out.println();
            } else {
                Collections.sort(list, new Comparator<Integer>() {
                    @Override
                    public int compare(Integer o1, Integer o2) {
                        return o2.compareTo(o1);
                    }
                });
                for (Integer out : list) {
                    System.out.println(out + " ");
                }
                System.out.println();
            }
        }

    }
}
