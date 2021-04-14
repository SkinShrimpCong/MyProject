package haifeng.cong.practical;

import java.util.Arrays;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/6 13:29
 *
 * @author conghaifeng
 */
public class CpuResolve {

    public static void main(String[] args){
        int[] times = {8, 4, 3, 1, 10};
        System.out.println(cpuResolve(3, 5, times));
    }



    public static int cpuResolve(int cpus, int tasks, int[] times) {
        int[][] cpuState = new int[cpus][2];
        Arrays.sort(times);
        int ans = 0;

        if (tasks <= cpus) {
            return times[times.length -1];
        }

        while (tasks > 0) {

            while (true) {
                int cpuIndex = findFreeCpu(cpuState);
                if (cpuIndex < 0) {
                    break;
                }
                cpuState[cpuIndex][0] = 1;
                cpuState[cpuIndex][1] = times[times.length - tasks];
                tasks--;
            }


            while (findFreeCpu(cpuState) == -1) {
                ans++;
                dotask(cpuState);
            }
        }
        int rest = findMax(cpuState);
        return ans + rest;

    }

    public static int findFreeCpu(int[][] cpuState) {
        for (int i = 0; i < cpuState.length; i++) {
            if (cpuState[i][0] == 0) {
                return i;
            }
        }
        return -1;
    }

    public static int findMax(int[][] cpuState) {
        int max = 0;
        for (int i = 0; i < cpuState.length; i++) {
            if (cpuState[i][1] > max) {
                max = cpuState[i][1];
            }
        }
        return max;
    }

    public static void dotask(int[][] cpuState) {
        for (int i = 0; i < cpuState.length; i++) {
            if(cpuState[i][1] > 0) {
                cpuState[i][1] = cpuState[i][1] - 1;
            }
            if (cpuState[i][1] == 0) {
                cpuState[i][0] = 0;
            }
        }
    }
}
