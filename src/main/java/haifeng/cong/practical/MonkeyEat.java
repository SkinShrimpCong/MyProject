package haifeng.cong.practical;

/**
 * Description:
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/5 17:28
 *
 * @author conghaifeng
 */
public class MonkeyEat {

    public static void main(String[] args){
        System.out.println(monkey());
    }

    public static int monkey() {
        int ans = 1;
        for (int i = 0; i < 9; i++) {
            ans = (ans + 1) *2;
        }
        return ans;
    }
}
