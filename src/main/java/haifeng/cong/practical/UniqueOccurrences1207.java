package haifeng.cong.practical;

import java.util.HashMap;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/5 9:27
 *
 * @author conghaifeng
 */
public class UniqueOccurrences1207 {

    public static void main(String[] args){
        int[] arr = {1,2};
        System.out.println(uniqueOccurrences(arr));
    }
    public static boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            Integer times = numMap.getOrDefault(arr[i], 0);
            numMap.put(arr[i], ++times);
        }
        HashMap<Integer, Integer> times = new HashMap<>();
        for (int time : numMap.values()) {
            Integer flag = times.getOrDefault(time, 0);
            if (flag > 0) {
                return false;
            }
            times.put(time, ++flag);

        }
        return true;

    }


}
