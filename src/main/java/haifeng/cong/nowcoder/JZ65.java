package haifeng.cong.nowcoder;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/20 15:58
 *
 * @author conghaifeng
 */
public class JZ65 {

    public int add(int a, int b) {

        while (b > 0) {
            int c = (a & b) << 1;//进位
            a^=b;//求非进位和
            b = c;//保存进位结果，用于下一轮计算
        }
        return a;
    }
}
