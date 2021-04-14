package haifeng.cong.practical;

import java.util.Arrays;

/**
 * Description: 976. 三角形的最大周长
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/2 21:53
 *
 * @author conghaifeng
 */
public class LargestPerimeter {

    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        for (int i = A.length -1; i >= 2 ; i--) {
            int twoLen = A[i - 1] + A[i - 2];
            if (A[i] < twoLen) {
                return A[i] + twoLen;
            }
        }
        return 0;
    }
}
