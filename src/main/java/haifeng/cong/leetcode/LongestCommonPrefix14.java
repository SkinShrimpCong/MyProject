package haifeng.cong.leetcode;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/17 11:37
 *
 * @author conghaifeng
 */
public class LongestCommonPrefix14 {

    public static void main(String[] args){
        String[] input = {"flower","fkow"};
        String s = longestCommonPrefix(input);
        System.out.println(s);
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        int right = strs[0].length() - 1;
        for (int i = 1; i < strs.length; i++) {
            if (right < 0) {
                return "";
            }
            if (strs[i].length() <= right) {
                right = strs[i].length() - 1;
            }
            for (int j = 0; j <= right; j++) {
                if (strs[0].charAt(j) != strs[i].charAt(j)) {
                    right = j -1;
                    break;
                }
            }

        }
        return strs[0].substring(0, right + 1);
    }

}
