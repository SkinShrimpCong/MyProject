package haifeng.cong.DynamicProxy.demo;

/**
 * Description: 动态代理演示类
 *
 * 这样只要实现了Dog接口的类，就可以通过动态代理进行方法增强，而不需要增加代理类
 * Copyright: Copyright (c) 2021
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/4/5 23:48
 *
 * @author conghaifeng
 */
public class Test {

    public static void main(String[] args) throws Exception {
        TestDog testDog = new TestDog();
        Dog proxyDog = (Dog) MyProxyFactory.getProxy(testDog);
        proxyDog.info();
        proxyDog.run();
    }
}
