package haifeng.cong.nowcoder;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/22 9:27
 *
 * @author conghaifeng
 */
public class JZ62 {

    public static void main(String[] args){
        System.out.println(lastRemaining(5, 3));
    }

    public static int lastRemaining(int n, int m) {
        int ans = 0;

        for (int i = 2; i <= n; i++) {
            ans = (ans + m) % i;
        }
        return ans;
    }
}
