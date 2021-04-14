package haifeng.cong.nowcoder;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/18 23:47
 *
 * @author conghaifeng
 */
public class JZ48 {

    public static void main(String[] args){
        System.out.println(lengthOfLongestSubstring("aab"));
    }

    public static int lengthOfLongestSubstring(String s) {
        int ans = 0;

        int left = 0;
        int right = 0;
        while (left < s.length() && right < s.length()) {
            String subString = s.substring(left, right + 1);
            right++;
            while (right <s.length() && subString.contains(String.valueOf(s.charAt(right)))) {
                ans = Math.max(ans, right - left);
                left++;
                subString = s.substring(left, right);
            }
        }
        ans = Math.max(ans, right - left);
        return ans;
    }
}
