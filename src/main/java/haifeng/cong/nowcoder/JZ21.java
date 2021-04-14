package haifeng.cong.nowcoder;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/20 14:29
 *
 * @author conghaifeng
 */
public class JZ21 {

    public static void main(String[] args){
        exchange(new int[]{1,2,3,4});
    }

    public static int[] exchange(int[] nums) {
        int first = 0;
        int second = nums.length - 1;
        while(first < second) {
            if ((nums[first] & 1) == 1) {
                first++;
                continue;
            }
            if ((nums[first] & 1) == 0) {
                second--;
                continue;
            }
            int temp = nums[first];
            nums[first] = nums[second];
            nums[second] = temp;
        }
        return nums;
    }
}
