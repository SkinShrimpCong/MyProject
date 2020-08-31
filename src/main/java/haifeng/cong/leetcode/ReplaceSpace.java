package haifeng.cong.leetcode;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2020/8/18 10:21
 *
 * @author conghaifeng
 */
public class ReplaceSpace {

    private static String replaceSpace(String s) {
        return s.replace(" ", "%20");
    }

    public static void main(String[] args){
        System.out.println(replaceSpace("We are happy."));
    }
}
