package haifeng.cong.DynamicProxy.demo;

/**
 * Description: 实现类
 * Copyright: Copyright (c) 2021
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/4/5 23:34
 *
 * @author conghaifeng
 */
public class TestDog implements Dog {

    @Override
    public void info() {
        System.out.println("我是一只猎狗");
    }

    @Override
    public void run() {
        System.out.println("奔跑迅速");
    }
}
