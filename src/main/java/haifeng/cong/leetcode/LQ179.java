package haifeng.cong.leetcode;

import java.util.Arrays;

/**
 * Description: 179. 最大数
 *
 * 给定一组非负整数 nums，重新排列每个数的顺序（每个数不可拆分）使之组成一个最大的整数。
 *
 * 注意：输出结果可能非常大，所以你需要返回一个字符串而不是整数。
 * Copyright: Copyright (c) 2021
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/4/12 0:25
 *
 * @author conghaifeng
 */
public class LQ179 {

    public static void main(String[] args) {
        System.out.println(largestNumber(new int[]{10,0}));
        String a = "ABC";
        String b = "ABC";
        String c = new String("ABC");
        System.out.println(a==b);
    }

    public static String largestNumber(int[] nums) {

        String[] strNums = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            strNums[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(strNums,LQ179::compare);

        StringBuilder stringBuilder = new StringBuilder();
        for (String string : strNums) {
            if(stringBuilder.toString().equals("0") && string.equals("0")){
                continue;
            }
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    public static int compare(String first, String second) {
        return (second + first).compareTo(first + second);
    }


}
