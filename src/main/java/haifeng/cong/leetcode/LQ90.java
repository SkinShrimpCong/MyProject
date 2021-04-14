package haifeng.cong.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * Description: 90. 子集 II
 * 给你一个整数数组 nums ，其中可能包含重复元素，请你返回该数组所有可能的子集（幂集）。
 *
 * 解集 不能 包含重复的子集。返回的解集中，子集可以按 任意顺序 排列。
 * Copyright: Copyright (c) 2021
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/31 11:02
 *
 * @Author conghaifeng
 */
public class LQ90 {

    public static void main(String[] args){
        System.out.println(subsetsWithDup(new int[]{5,5,5,5,5}));
    }

    static List<List<Integer>> ans = new LinkedList<>();
    static LinkedList<Integer> list = new LinkedList<>();

    public static List<List<Integer>> subsetsWithDup(int[] nums) {

        if (nums.length == 0) {
            return ans;
        }
        Arrays.sort(nums);

        backTrack(true, nums, 0);
        return ans;
    }

    private static void backTrack(boolean choosePre, int[] nums, int index) {
        if (index > nums.length - 1) {
            ans.add(new LinkedList<>(list));
            return;
        }

        backTrack(false, nums, ++index);
        index--;
        if (!choosePre && index > 0 && nums[index - 1] == nums[index]) {
            return;
        }
        list.add(nums[index]);
        backTrack(true, nums, ++index);
        list.removeLast();
    }
}
