package haifeng.cong.hj;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/13 0:09
 *
 * @author conghaifeng
 */
public class HJ26 {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String input = scanner.nextLine();
            System.out.println(solve(input));
        }
    }

    public static String solve(String input) {
        char[] inputChars = input.toCharArray();
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < inputChars.length; i++) {
            if (isEnglishChar(inputChars[i])) {
                list.add(inputChars[i]);
            }
        }
        list.sort(new Comparator<Character>() {
            @Override
            public int compare(Character o1, Character o2) {
                return Character.toLowerCase(o1) - Character.toLowerCase(o2);
            }
        });
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (isEnglishChar(inputChars[i])) {
                stringBuilder.append(list.poll());
            } else {
                stringBuilder.append(inputChars[i]);
            }
        }
        return stringBuilder.toString();
    }

    public static boolean isEnglishChar(char key) {
        if (('a' <= key && key <='z') || ('A' <= key && key <='Z')) {
            return true;
        }
        return false;
    }

//    public static void main(String[] args){
//        int[][] costs = {{1,2,3},{3,2,1},{2,2,2,}};
//        Arrays.sort(costs, new Comparator<int[]>() {
//            @Override
//            public int compare(int[] o1, int[] o2) {
//                return o1[0] - o2[0];
//            }
//        });
//        System.out.println(Arrays.toString(costs));
//    }
}
