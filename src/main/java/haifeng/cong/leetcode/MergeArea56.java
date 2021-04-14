package haifeng.cong.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/16 12:45
 *
 * @author conghaifeng
 */
public class MergeArea56 {

    public static void main(String[] args){
        int[][] input = {{1,4},{4,5}};
        int[][] merge = merge(input);
        System.out.println(Arrays.toString(merge));
    }

    public static int[][] merge(int[][] intervals) {
        ArrayList<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0] - o2[0];
            }
        });
        int pre = intervals[0][0];
        int end = intervals[0][1];
        for (int i = 1; i < intervals.length; i++) {
            if (end >= intervals[i][0]) {
                end = Math.max(end, intervals[i][1]);
            } else {
                int[] ans = {pre, end};
                list.add(ans);
                pre = intervals[i][0];
                end = intervals[i][1];
            }
        }
        if (list.size() == 0 ||end > list.get(list.size() -1)[1]) {
            int[] ans = {pre, end};
            list.add(ans);
        }
        return list.toArray(new int[list.size()][]);
    }
}
