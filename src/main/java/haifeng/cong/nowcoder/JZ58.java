package haifeng.cong.nowcoder;

/**
 * Description: 剑指 Offer 58 - II. 左旋转字符串
 * Copyright: Copyright (c) 2020
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/3/22 23:00
 *
 * @author conghaifeng
 */
public class JZ58 {

    public String reverseLeftWords(String s, int n) {
        return s.substring(n) + s.substring(0, n);
    }

}
