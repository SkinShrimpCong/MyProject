package haifeng.cong.DynamicProxy.demo;

import java.lang.reflect.Proxy;

/**
 * Description: 生成动态代理实例的工厂
 * Copyright: Copyright (c) 2021
 * Company: Ruijie Co., Ltd.
 * Create Time: 2021/4/5 23:45
 *
 * @author conghaifeng
 */
public class MyProxyFactory {

    public static Object getProxy(Object target) throws Exception {
        MyInvokationHandler myInvokationHandler = new MyInvokationHandler();
        myInvokationHandler.setTarget(target);
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), myInvokationHandler);
    }
}
