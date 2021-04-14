package haifeng.cong.Interview.hw;

import java.util.*;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/13 18:38
 *
 * @author conghaifeng
 */
public class Test2 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int[][] inputNum = new int[1000][2];
        LinkedHashMap<String, List<Integer>> map = new LinkedHashMap<>();
        ArrayList<Integer> list = new ArrayList<>();
        String[] fruit = new String[1000];
        int flag = 0;
        while (scanner.hasNext()) {

            fruit[flag] = scanner.next();
            inputNum[flag][0] = scanner.nextInt();
            inputNum[flag][1] = scanner.nextInt();
            flag++;
        }
        String[] fruitSecond = new String[flag];
        int[][] input = new int[flag][2];
        for (int i = 0; i < flag; i++) {
            fruitSecond[i] = fruit[i];
            input[i][0] = inputNum[i][0];
            input[i][1] = inputNum[i][1];
        }
        solve(fruitSecond, input);
    }

    public static void solve(String[] fruit, int[][] inputNum) {
        LinkedHashMap<String, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < fruit.length; i++) {
            map.put(fruit[i], map.getOrDefault(fruit[i], 0) + 1);
        }
        for (String fru : map.keySet()) {
            Integer fruitNum = map.get(fru);
            int[][] fruits = new int[fruitNum][2];
            int flag = 0;
            for (int i = 0; i < fruit.length; i++) {
                if (fruit[i].equals(fru)) {
                    fruits[flag][0] = inputNum[i][0];
                    fruits[flag][1] = inputNum[i][1];
                    flag++;
                }
            }
            int[][] result = sort(fruits);
            for (int i = 0; i < fruitNum; i++) {
                System.out.println(fru + " " + result[i][0] + " " + result[i][1]);
            }
        }
    }

    public static int[][] sort(int[][] input) {
        Arrays.sort(input, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        Arrays.sort(input, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        return input;
    }
}
