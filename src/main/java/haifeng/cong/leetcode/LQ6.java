package haifeng.cong.leetcode;

import java.util.ArrayList;

/**
 * Description: 6. Z 字形变换
 * Copyright: Copyright (c) 2021
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/30 13:56
 *
 * @Author conghaifeng
 */
public class LQ6 {

    public static void main(String[] args){
        System.out.println(convert("AB", 1));
    }

    public static String convert(String s, int numRows) {
        if(numRows < 2) return s;
        int index = 0;
        int flag = 1;
        //用list存放stringBuilder对象
        ArrayList<StringBuilder> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            list.add(new StringBuilder());
        }

        for (int i = 0; i < s.length(); i++) {
            list.get(index).append(s.charAt(i));
            index += flag;
            if (index == 0 || index == numRows - 1) {
                flag = -flag;
            }
        }

        for (int i = 1; i < numRows; i++) {
            list.get(0).append(list.get(i));
        }

        return list.get(0).toString();
    }
}
