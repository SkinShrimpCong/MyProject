package haifeng.cong.leetcode;

/**
 * Description:647. 回文子串
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/8 23:42
 *
 * @author conghaifeng
 */
public class CountSubstrings647 {

    public static void main(String[] args){
        System.out.println(countSubstrings2("abc"));
    }

    public static int countSubstrings(String s) {
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < 2; j++) {
                int left = i;
                int right = i + j;
                while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                    left--;
                    right++;
                    ans++;
                }
            }
        }
        return ans;
    }

    public static int countSubstrings2(String s) {
        int ans = 0;
        for (int i = 0; i < 2 * s.length() - 1; i++) {
            int left = i / 2;
            int right = i / 2+ i % 2;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                left--;
                right++;
                ans++;
            }

        }
        return ans;
    }
}
