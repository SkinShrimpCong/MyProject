package haifeng.cong.Interview.hw;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/16 18:08
 *
 * @author conghaifeng
 */
public class Solve1 {

    public static void main(String[] args){
        System.out.println(solve("+++9..9---d"));
    }

    public static String solve(String input) {
        String ans = "";

        Matcher matcher = Pattern.compile("[+-]?\\d+(\\.\\d+|\\d*)").matcher(input);

        while (matcher.find()) {
            String group = matcher.group();

            if (group.length() >= ans.length()) {
                ans = group;
            }
        }

        return ans;

    }

}
