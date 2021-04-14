package haifeng.cong.nowcoder;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/18 11:28
 *
 * @author conghaifeng
 */
public class JZ8 {

    public static void main(String[] args){
        System.out.println(jumpFloor(3));
    }

    public static int jumpFloor(int target) {
        if (target <= 2) {
            return target;
        }
        return jumpFloor(target - 1) + jumpFloor(target - 2);
    }
}
