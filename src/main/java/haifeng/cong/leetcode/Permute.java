package haifeng.cong.leetcode;

import java.util.LinkedList;
import java.util.List;

/**
 * Description:46. 全排列
 * 给定一个 没有重复 数字的序列，返回其所有可能的全排列。
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/1/17 16:43
 *
 * @author conghaifeng
 */
public class Permute {

    static List<List<Integer>> anw = new LinkedList<>();

    public static List<List<Integer>> permute(int[] nums) {
        //路径表
        LinkedList<Integer> backtrack = new LinkedList<>();
        backTrack(nums, backtrack);
        return anw;

    }

    private static void backTrack(int[] nums, LinkedList<Integer> backtrack) {
        //触发结束，base case
        if (backtrack.size() == nums.length) {
            // 注意此处重新新建对象，否则都是存的同一个对象，最后该对象会被初始化
            anw.add(new LinkedList<>(backtrack));
            return;
        }
        for (int num : nums) {
            // 排除不合法的选项
            if (backtrack.contains(num)) {
                continue;
            }
            // 做选择
            backtrack.add(num);
            // 进入下一层决策树
            backTrack(nums, backtrack);
            // 取消选择
            backtrack.removeLast();
        }

    }

    public static void main(String[] args){
        permute(new int[]{1,2,3}).toString();
        System.out.println(permute(new int[]{1,2,3}).toString());
    }

}
